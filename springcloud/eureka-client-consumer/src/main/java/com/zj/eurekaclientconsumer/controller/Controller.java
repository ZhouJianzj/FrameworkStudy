package com.zj.eurekaclientconsumer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zhoujian
 */
@RestController
public class Controller {
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("test")
    public String doTest() {
//        当中的url使用的是服务提供者的服务 名称
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://eureka-client-provider/test", String.class);
        String body = forEntity.getBody();
        return "使用eureka注册中心的服务的消费者" + "——————" + body;
    }
}
