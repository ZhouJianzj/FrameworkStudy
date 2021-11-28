package com.zj.eurekazuul.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("test")
    public String test() {
        return restTemplate.getForObject("http://011-eureka-zuul/test", String.class);
    }
}
