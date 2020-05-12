package com.xxicon.poker.config;

import com.xxicon.poker.core.action.ActionFactory;
import com.xxicon.poker.core.action.AutoLoadActionFactory;
import com.xxicon.poker.core.channel.ChannelExecutor;
import com.xxicon.poker.core.channel.ChannelExecutorRouter;
import com.xxicon.poker.core.filter.FilterChainFactory;
import com.xxicon.poker.core.message.AutoLoadMessageFactory;
import com.xxicon.poker.core.message.MessageFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class PokerConfig {
    @Bean
    public MessageFactory messageFactory() {
        AutoLoadMessageFactory messageFactory = new AutoLoadMessageFactory();
        messageFactory.setPkgList(Collections.singletonList("com.xxicon.poker.message"));
        return messageFactory;
    }

    @Bean
    public ActionFactory actionFactory() {
        AutoLoadActionFactory actionFactory = new AutoLoadActionFactory();
        actionFactory.setMessageFactory(messageFactory());
        actionFactory.setPkgList(Collections.singletonList("com.xxicon.poker.action"));
        return actionFactory;
    }

    @Bean
    public FilterChainFactory filterChainFactory() {
        return new FilterChainFactory();
    }

    @Bean
    public ChannelExecutor channelExecutor() {
        ChannelExecutor executor = new ChannelExecutor();
        executor.setActionFactory(actionFactory());
        executor.setMessageFactory(messageFactory());
        executor.setFilterChainFactory(filterChainFactory());
        return executor;
    }

    @Bean
    public ChannelExecutorRouter executorRouter() {
        ChannelExecutorRouter router = new ChannelExecutorRouter();
        router.setDefaultExecutor(channelExecutor());
        return router;
    }
}
