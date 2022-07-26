package com.example.demowebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import javax.websocket.server.ServerEndpoint;
import javax.xml.ws.Endpoint;

/**
 * @author zhoujian
 */
@SpringBootApplication
public class DemoWebsocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoWebsocketApplication.class, args);
    }

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }


}
