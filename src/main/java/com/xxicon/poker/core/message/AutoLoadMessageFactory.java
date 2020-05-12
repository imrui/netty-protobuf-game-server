package com.xxicon.poker.core.message;

import com.xxicon.poker.core.util.RTSI;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import java.lang.reflect.Method;
import java.util.*;

@Slf4j
public class AutoLoadMessageFactory implements MessageFactory {
    private static final String UNDERLINE = "_";
    private static final String CMD_REQ = "Req";
//    private static final String CMD_RESP = "Resp";
    @Setter
    private List<String> pkgList = new ArrayList<>();
    @Setter
    private boolean searchSubDir = false;
    private Map<String, Class<GeneratedMessageV3>> classMap = new HashMap<>();
    private Map<String, Integer> cmdIdMap = new HashMap<>();
    private Map<String, Parser<GeneratedMessageV3>> parserMap = new HashMap<>();

    @PostConstruct
    public void init() throws Exception {
        Set<Class> clazzSet = RTSI.findClass(this.pkgList, GeneratedMessageV3.class, this.searchSubDir);
        for (Class clazz : clazzSet) {
            int cmdId = this.parseCmdId(clazz.getSimpleName());
            String className = clazz.getName();
            if (cmdId == 0) {
                log.debug("load message ignore: clazz = {}", className);
                continue;
            }
            Method method = clazz.getMethod("parser");
            Parser<GeneratedMessageV3> parser = (Parser<GeneratedMessageV3>) method.invoke(null);
            this.parserMap.put(String.valueOf(cmdId), parser);
            this.classMap.put(String.valueOf(cmdId), clazz);
            this.cmdIdMap.put(className, cmdId);
            log.info("load message: cmdId = {}, clazz = {}", cmdId, className);
        }
        log.info("load message finished. size = {}", this.classMap.size());
    }

    // C0001_HeartbeatReq
    private int parseCmdId(String classSimpleName) {
        try {
            if (!classSimpleName.contains(UNDERLINE)) {
                return 0;
            }
            String[] arr = classSimpleName.split(UNDERLINE);
            if (arr.length != 2) {
                return 0;
            }
            int cmdId = Integer.parseInt(arr[0].substring(1));
            if (classSimpleName.endsWith(CMD_REQ)) {
                return cmdId;
            }
            return -cmdId;
        } catch (Exception e) {
            log.error("", e);
        }
        return 0;
    }

    @Override
    public Class<GeneratedMessageV3> getMessageClass(String cmdId) throws ClassNotFoundException {
        Class<GeneratedMessageV3> clazz = this.classMap.get(cmdId);
        if (clazz == null) {
            throw new ClassNotFoundException("cmdId = " + cmdId);
        }
        return clazz;
    }

    @Override
    public Parser<GeneratedMessageV3> getParser(String cmdId) {
        return this.parserMap.get(cmdId);
    }

    @Override
    public int getCmdId(String clazzName) {
        return this.cmdIdMap.get(clazzName);
    }

    @Override
    public GeneratedMessageV3 parseMessage(String cmdId, ByteString data) throws InvalidProtocolBufferException {
        Parser<GeneratedMessageV3> parser = this.getParser(cmdId);
        return parser.parseFrom(data);
    }
}
