package com.zj.demospringcloudhystrixconsumer.web;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class Controller {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("one")
    @HystrixCommand
    public String one() {
        String url = "http://localhost:8085/one";
        return "one----------->" + restTemplate.getForObject(url, String.class);
    }

    @RequestMapping("two")
    @HystrixCommand
    public String two() {
        String url = "http://localhost:8085/two";
        return "two----------->" + restTemplate.getForObject(url, String.class);
    }
}
