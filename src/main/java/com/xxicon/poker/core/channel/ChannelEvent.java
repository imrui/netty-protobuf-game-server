package com.xxicon.poker.core.channel;

import com.google.protobuf.ByteString;
import io.netty.channel.Channel;
import lombok.Data;

@Data
public class ChannelEvent {
    private Channel channel;
    private String actionKey;
    private ByteString message;

    public ChannelEvent() {
    }

    public ChannelEvent(Channel channel, String actionKey, ByteString message) {
        this.channel = channel;
        this.actionKey = actionKey;
        this.message = message;
    }
}
