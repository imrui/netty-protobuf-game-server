package com.xxicon.poker.server;

import com.xxicon.poker.core.websocket.WebSocketServerInitializer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Service
public class NettyServer {
    private EventLoopGroup bossGroup;
    private EventLoopGroup workerGroup;
    private ChannelFuture channelFuture;
    @Value("${server.port}")
    private int port;
    private final WebSocketServerInitializer webSocketServerInitializer;

    public NettyServer(WebSocketServerInitializer webSocketServerInitializer) {
        this.webSocketServerInitializer = webSocketServerInitializer;
    }

    @PostConstruct
    public void init() throws Exception {
//        this.test();
        this.bossGroup = new NioEventLoopGroup();
        this.workerGroup = new NioEventLoopGroup();
        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                .handler(new LoggingHandler(LogLevel.INFO))
                .childHandler(this.webSocketServerInitializer);
        log.info("NettyServer start success, port: {}", this.port);
        this.channelFuture = bootstrap.bind(this.port).sync();
    }

    @PreDestroy
    public void shutdown() throws InterruptedException {
        try {
            this.channelFuture.channel().closeFuture().sync();
            log.info("NettyServer shutdown success");
        } finally {
            this.workerGroup.shutdownGracefully();
            this.bossGroup.shutdownGracefully();
        }
    }
}
