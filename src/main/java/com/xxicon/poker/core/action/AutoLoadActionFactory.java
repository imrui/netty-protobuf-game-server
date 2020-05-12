package com.xxicon.poker.core.action;

import com.xxicon.poker.core.util.RTSI;
import com.xxicon.poker.core.message.MessageFactory;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

@Slf4j
public class AutoLoadActionFactory implements ActionFactory {
    private Map<String, Action> actionMap = new HashMap<>();
    @Setter
    private List<String> pkgList = new ArrayList<>();
    @Setter
    private boolean searchSubDir = false;
    @Setter
    private MessageFactory messageFactory;

    @PostConstruct
    public void init() {
        Set<Class> actionClass = RTSI.findClass(this.pkgList, Action.class, this.searchSubDir);
        for (Class clazz : actionClass) {
            try {
                Action action = (Action) clazz.newInstance();
                Type[] types = ((ParameterizedType) action.getClass().getGenericSuperclass()).getActualTypeArguments();
                Class cls = (Class) types[0];
                int cmdId = this.messageFactory.getCmdId(cls.getName());
                if (cmdId == 0) {
                    continue;
                }
                this.actionMap.put(String.valueOf(cmdId), action);
                log.info("load action: cmdId = {}, clazz = {}", cmdId, clazz.getName());
            } catch (InstantiationException | IllegalAccessException e) {
                log.error("", e);
            }
        }
        log.info("load action finished. size = {}", this.actionMap.size());
    }

    @Override
    public boolean register(String cmdId, Action action) {
        if (cmdId == null || cmdId.length() == 0 || action == null) {
            return false;
        }
        this.actionMap.put(cmdId, action);
        return true;
    }

    @Override
    public Action getAction(String cmdId) {
        return this.actionMap.get(cmdId);
    }

    @Override
    public Collection<Action> actionList() {
        return this.actionMap.values();
    }
}
