package com.example.demoprovider.provider;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author zhoujian
 */
@Component
public class KafkaMessageProvider {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;



}