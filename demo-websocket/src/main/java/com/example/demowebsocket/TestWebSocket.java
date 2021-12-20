package com.example.demowebsocket;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author zhoujian
 */


@ServerEndpoint("/test")
@RestController
public class TestWebSocket {

    private Session session;


    /**
     * 建立连接。
     * 建立连接时入参为session
     */
    @OnOpen
    public void onOpen(Session session){
        this.session = session;
        System.out.println("建立了连接"+ session.getId());
    }

    /**
     * 关闭连接
     */
    @OnClose
    public void onClose(){
        System.out.println("连接关闭"+ session.getId());
    }

    /**
     * 接收前端传过来的数据。
     * 虽然在实现推送逻辑中并不需要接收前端数据，但是作为一个webSocket的教程或叫备忘，还是将接收数据的逻辑加上了。
     */
    @OnMessage
    public void onMessage( String message , Session session){
        System.out.println(message + "------from------" + session.getId());
        try {
            sendMessage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void sendMessage() throws IOException {
        this.session.getBasicRemote().sendText("message");
    }
}
