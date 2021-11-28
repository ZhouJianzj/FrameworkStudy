package com.example.demoprovider.provider;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import javax.annotation.Resource;

/**
 * @author zhoujian
 */
@Component
public class KafkaMessageProvider {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    /**
     *
     * @param topic 指定主题
     * @param key 键
     * @param message 值
     * @return
     */
    public Boolean send(String topic, String key, String message) {
        System.out.println(topic + " " + key +  " " + message);
        System.out.println(kafkaTemplate.toString());

        return null;
    }
}