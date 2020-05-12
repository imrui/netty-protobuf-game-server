package com.xxicon.poker.core.filter;

import com.xxicon.poker.core.action.ActionContext;
import com.google.protobuf.MessageLite;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogMessageFilter implements Filter {

    @Override
    public void doFilter(ActionContext context, FilterChain chain) throws Exception {
        try {
            MessageLite reqMsg = context.getReqMsg();
            log.info("Receive: {} {}", context.getActionKey(), reqMsg.toString());
        } catch (Exception e) {
            log.error("", e);
        }
        chain.doFilter(context);
        MessageLite respMsg = context.getRespMsg();
        log.info("Send: {}", respMsg);
    }

}
