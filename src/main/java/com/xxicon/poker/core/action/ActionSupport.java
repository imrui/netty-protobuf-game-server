package com.xxicon.poker.core.action;

import com.google.protobuf.GeneratedMessageV3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ActionSupport<M extends GeneratedMessageV3> implements Action {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public GeneratedMessageV3 execute(ActionContext context) {
        try {
            return this.execute(context, (M) context.getReqMsg());
        } catch (Exception e) {
            this.logger.error("", e);
        }
        return null;
    }

    public abstract GeneratedMessageV3 execute(ActionContext context, M reqMsg);
}
