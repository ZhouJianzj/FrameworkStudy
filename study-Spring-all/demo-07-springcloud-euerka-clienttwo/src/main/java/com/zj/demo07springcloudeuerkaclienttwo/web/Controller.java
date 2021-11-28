package com.zj.demo07springcloudeuerkaclienttwo.web;


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
    public String testAction() {
        ResponseEntity<String> forEntity = restTemplate.
                getForEntity("http://springcloud-eureka-clientone/test", String.class);
        return "eureka client two request------->" + forEntity.getBody();
    }

    @RequestMapping("zj")
    public String doTestAction() {
        return "zhoujian";
    }
}
