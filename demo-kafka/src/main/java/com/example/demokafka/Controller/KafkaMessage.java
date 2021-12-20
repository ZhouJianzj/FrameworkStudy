package com.example.demokafka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 */
@RestController
public class KafkaMessage {
    /**
     * 模板类的注入
     */
    @Autowired
    private KafkaTemplate<String,String> tmp;

    /**
     * 消息的生产这
     */
    @GetMapping("/send")
    public String sendToKafka(String msg){

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(2000);
                        tmp.send("pipe",msg);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        new Thread(runnable).start();
        return "send success";
    }

    /**
     * 消息的消费者
     */
    @KafkaListener(topics="pipe",groupId = "gr01")
    public void consumerMsg(Object msg){
        System.out.println("================"+msg+"==============");
    }
}
