package com.zj.demo13springcloudeurekaclientto9200consumed9100.web;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class Controller {
    @Resource
    private RestTemplate restTemplate;
    @RequestMapping("test")
    public String test(){
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://demo-12-springcloud-eureka-client-to9100/test",String.class);
        return "client on 9500 消费了" + forEntity.getBody();
    }
    @RequestMapping("zj")
    public String zJ(){
        return "zhoujian";
    }
}
