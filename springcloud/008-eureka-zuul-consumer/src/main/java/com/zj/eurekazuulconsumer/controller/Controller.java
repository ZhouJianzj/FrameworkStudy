package com.zj.eurekazuulconsumer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


@RestController
public class Controller {
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/doTest")
    public String doTest(){
//        没有token的时候会报错误
        StringBuffer url = new StringBuffer();
        url.append("http://008-eureka-zuul/zhoujian/test");
//        url.append("?token=123");
        String s = url.toString();
        String body = restTemplate.getForObject(s, String.class);
        return  "服务消费者------"+ body;
    }
    @RequestMapping("/doTestTwo")
    public String doTestTwo(){
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://008-eureka-zuul/zhoujian/testTwo", String.class);
        return forEntity.getBody();
    }
}
