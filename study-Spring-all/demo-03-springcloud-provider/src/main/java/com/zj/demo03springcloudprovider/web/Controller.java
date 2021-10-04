package com.zj.demo03springcloudprovider.web;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class Controller {

    @RequestMapping("/test")
    public String test(){

        return "springcloud的服务提供者";
    }
}
