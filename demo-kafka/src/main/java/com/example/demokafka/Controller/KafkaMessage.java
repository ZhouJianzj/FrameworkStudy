package com.example.demokafka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @Transactional
    public String sendToKafka( String input){
        tmp.send("test",input);
        return "send success";
    }

    /**
     * 消息的消费者
     */
    @KafkaListener(topics="test",groupId = "test-consumer-group")
    public void consumerMsg(String msg){
        System.out.println("================"+msg+"==============");
    }
}
