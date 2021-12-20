package com.example.demowebsocketsubscried.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;


/**
 * @author HeJD
 * @date 2018/9/3 16:58
 * @Description:WebSocket配置类
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        /*
         * 用户可以订阅来自以"/topic"为前缀的消息，
         * 客户端只可以订阅这个前缀的主题
         */
        config.enableSimpleBroker("/topic");
        /*
         * 客户端发送过来的消息，需要以"/app"为前缀，再经过Broker转发给响应的Controller,
         * 我这里基本没用到，声明有说
         */
        config.setApplicationDestinationPrefixes("/app");

    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        /*
         * 路径"/webSocketEndPoint"被注册为STOMP端点，对外暴露，客户端通过该路径接入WebSocket服务
         */
        registry.addEndpoint("websocket/socketServer.action");
    }

}