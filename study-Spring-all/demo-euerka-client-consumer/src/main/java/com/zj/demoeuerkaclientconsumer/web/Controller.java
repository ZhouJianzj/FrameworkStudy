package com.zj.demoeuerkaclientconsumer.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class Controller {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("testZuul")
    public String testZuul() {
        return restTemplate.getForObject("http://demo-eureka-client-zuul/consumer/testZuul", String.class);
    }
}
