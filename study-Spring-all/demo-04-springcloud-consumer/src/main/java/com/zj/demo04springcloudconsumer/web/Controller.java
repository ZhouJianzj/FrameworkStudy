package com.zj.demo04springcloudconsumer.web;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class Controller {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public String test(){
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:8080/test", String.class);

        System.out.println(forEntity.getStatusCode());
        System.out.println(forEntity.getHeaders());
        System.out.println(forEntity.getBody());
        return "springcloud的服务的消费者------" + forEntity.getBody();
    }
}
