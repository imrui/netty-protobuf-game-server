package com.xxicon.poker.core.websocket;

import com.xxicon.poker.core.channel.ChannelEvent;
import com.xxicon.poker.core.channel.ChannelExecutorRouter;
import com.xxicon.poker.message.Header;
import com.google.protobuf.ByteString;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@ChannelHandler.Sharable
public class WebSocketServerHandler extends SimpleChannelInboundHandler<Header> {
    private final ChannelExecutorRouter executorRouter;

    public WebSocketServerHandler(ChannelExecutorRouter executorRouter) {
        this.executorRouter = executorRouter;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Header msg) throws Exception {
        int id = msg.getId();
        ByteString data = msg.getData();
        ChannelEvent event = new ChannelEvent(ctx.channel(), String.valueOf(id), data);
        this.executorRouter.route(event).execute(event);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        this.printLog(ctx.channel(), "连接成功");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
        this.printLog(ctx.channel(), "连接断开");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
        this.printLog(ctx.channel(), "异常");
    }

    private void printLog(Channel ch, String info) {
        log.info("{} {}, {}", ch.remoteAddress(), ch.id().asLongText(), info);
    }
}
