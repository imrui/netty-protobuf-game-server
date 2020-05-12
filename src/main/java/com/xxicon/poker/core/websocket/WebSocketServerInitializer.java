package com.xxicon.poker.core.websocket;

import com.xxicon.poker.constant.Constants;
import com.xxicon.poker.message.Header;
import com.xxicon.poker.core.codec.Decoder;
import com.xxicon.poker.core.codec.Encoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.codec.http.websocketx.extensions.compression.WebSocketServerCompressionHandler;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.stream.ChunkedWriteHandler;
import org.springframework.stereotype.Service;

@Service
public class WebSocketServerInitializer extends ChannelInitializer<NioSocketChannel> {
    private final WebSocketServerHandler webSocketServerHandler;

    public WebSocketServerInitializer(WebSocketServerHandler webSocketServerHandler) {
        this.webSocketServerHandler = webSocketServerHandler;
    }

    @Override
    protected void initChannel(NioSocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        // HTTP请求的解码和编码
        pipeline.addLast(new HttpServerCodec());
        // 把多个消息转换为一个单一的FullHttpRequest或是FullHttpResponse，
        // 原因是HTTP解码器会在每个HTTP消息中生成多个消息对象HttpRequest/HttpResponse,HttpContent,LastHttpContent
        pipeline.addLast(new HttpObjectAggregator(Constants.MAX_AGGREGATED_CONTENT_LENGTH));
        // 主要用于处理大数据流，比如一个1G大小的文件如果你直接传输肯定会撑暴jvm内存的; 增加之后就不用考虑这个问题了
        pipeline.addLast(new ChunkedWriteHandler());
        // WebSocket数据压缩
        pipeline.addLast(new WebSocketServerCompressionHandler());
        // 协议包长度限制
        pipeline.addLast(new WebSocketServerProtocolHandler("/ws", null, true, Constants.MAX_FRAME_LENGTH));
        // 协议包解码
        pipeline.addLast(new Decoder());
        // 协议包编码
        pipeline.addLast(new Encoder());
        // 协议包解码时指定Protobuf字节数实例化为Header类型
        pipeline.addLast(new ProtobufDecoder(Header.getDefaultInstance()));
        // 业务处理器
        pipeline.addLast(this.webSocketServerHandler);
    }
}
