package com.xxicon.poker.core.channel;

import com.xxicon.poker.core.executor.Executor;
import com.xxicon.poker.core.executor.ExecutorRouter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

public class ChannelExecutorRouter implements ExecutorRouter<ChannelEvent> {

    private Map<String, Executor<ChannelEvent>> executorMap = new HashMap<>();
    @Setter
    private ChannelExecutor defaultExecutor;

    @Override
    public Executor<ChannelEvent> route(ChannelEvent event) {
        String actionKey = event.getActionKey();
        Executor<ChannelEvent> executor = this.executorMap.get(actionKey);
        if (executor != null) {
            return executor;
        }
        return this.defaultExecutor;
    }

}
