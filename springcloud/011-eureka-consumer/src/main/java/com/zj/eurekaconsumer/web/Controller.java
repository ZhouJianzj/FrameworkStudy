package com.zj.eurekaconsumer.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("test")
    public String test(){
        return restTemplate.getForObject("http://localhost:8003/gate", String.class);
    }
}
