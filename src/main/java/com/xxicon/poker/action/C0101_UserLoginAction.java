package com.xxicon.poker.action;

import com.xxicon.poker.core.action.ActionContext;
import com.xxicon.poker.message.C0101_UserLoginReq;
import com.xxicon.poker.message.C0101_UserLoginResp;

public class C0101_UserLoginAction extends BaseAction<C0101_UserLoginReq> {

    @Override
    public C0101_UserLoginResp execute(ActionContext context, C0101_UserLoginReq reqMsg) {
        this.logger.info("C0101 Action msg: {}", reqMsg);
        C0101_UserLoginResp resp = C0101_UserLoginResp.newBuilder()
                .setCode(200)
                .setMsg("success")
                .setSession("session")
                .setRoleId(2).build();
        return resp;
    }

}
