package com.xxicon.poker.action;

import com.xxicon.poker.core.action.ActionContext;
import com.xxicon.poker.message.C0001_HeartbeatReq;
import com.xxicon.poker.message.C0001_HeartbeatResp;

public class C0001_HeartbeatAction extends BaseAction<C0001_HeartbeatReq> {

    @Override
    public C0001_HeartbeatResp execute(ActionContext context, C0001_HeartbeatReq reqMsg) {
        this.logger.info("C0001 Action msg: {}", reqMsg);
        return C0001_HeartbeatResp.getDefaultInstance();
    }

}
