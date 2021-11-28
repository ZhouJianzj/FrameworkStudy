package com.example.demoprovider.web;

import com.example.demoprovider.provider.KafkaMessageProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhoujian
 */
@Controller
public class TestCtr {

    @GetMapping("send")
    public void send(String topic ,String key ,String value){
         new KafkaMessageProvider().send("test","name","zhoujian");
    }
}
