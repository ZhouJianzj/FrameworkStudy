package com.zj.loadbalanceconsumer.controller;

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
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://004-loadbalance-provider/test", String.class);

        return forEntity.getBody();
    }
}
