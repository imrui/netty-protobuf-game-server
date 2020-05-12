package com.xxicon.poker.core.channel;

import com.xxicon.poker.core.action.Action;
import com.xxicon.poker.core.action.ActionContext;
import com.xxicon.poker.core.action.ActionFactory;
import com.xxicon.poker.core.executor.Executor;
import com.xxicon.poker.core.filter.FilterChain;
import com.xxicon.poker.core.filter.FilterChainFactory;
import com.xxicon.poker.core.message.MessageFactory;
import com.xxicon.poker.message.Header;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import io.netty.channel.Channel;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChannelExecutor implements Executor<ChannelEvent> {
    @Setter
    private ActionFactory actionFactory;
    @Setter
    private MessageFactory messageFactory;
    @Setter
    private FilterChainFactory filterChainFactory;

    @Override
    public void execute(ChannelEvent event) {
        String actionKey = event.getActionKey();
        Action action = this.actionFactory.getAction(actionKey);
        if (action == null) {
            // todo 错误协议号响应
            log.error("Action not found, actionKey = {}", actionKey);
            return;
        }

        GeneratedMessageV3 reqMsg = null;
        try {
            reqMsg = this.messageFactory.parseMessage(actionKey, event.getMessage());
        } catch (InvalidProtocolBufferException e) {
            log.error("", e);
        }
        if (reqMsg == null) {
            return;
        }
//        log.info("receive data: {} {}", actionKey, reqMsg);

        Channel channel = event.getChannel();
        ActionContext context = new ActionContext();
        context.setActionKey(actionKey);
        context.setAction(action);
        context.setChannel(channel);
        context.setReqMsg(reqMsg);  // 根据协议号序列号请求消息

        try {
            FilterChain filterChain = this.filterChainFactory.createFilterChain();
            filterChain.doFilter(context);

            GeneratedMessageV3 respMsg = context.getRespMsg();
            Header header = this.buildHeader(respMsg);
            if (header != null) {
                channel.writeAndFlush(header);
//                log.info("response: {} {}", header.getId(), respMsg);
            }
        } catch (Exception e) {
            log.error("", e);
        }
    }

    private Header buildHeader(GeneratedMessageV3 result) {
        int cmdId = this.messageFactory.getCmdId(result.getClass().getName());
        if (cmdId == 0) {
            return null;
        }
        return Header.newBuilder()
                .setId(cmdId)
                .setData(result.toByteString())
                .build();
    }
}
