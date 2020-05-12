package com.xxicon.poker.core.action;

import com.google.protobuf.GeneratedMessageV3;
import io.netty.channel.Channel;
import lombok.Data;

@Data
public class ActionContext {
    private String actionKey;
    private Action action;
    private Channel channel;
    private GeneratedMessageV3 reqMsg;
    private GeneratedMessageV3 respMsg;
}
