package com.zj.consumer.controller;

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
    public String doTest(){
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://003-provider/test", String.class);

        return "eureka 集群下的服务消费者" + "-------------" + forEntity.getBody();
    }
}
