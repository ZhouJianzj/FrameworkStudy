package com.zj.hystrixbashboardconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhoujian
 */
@RestController
public class Controller {

    @RequestMapping("doTest")
    @HystrixCommand
    public String one() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:8083/doTest", String.class);

        return "服务的消费者-------" + forEntity.getBody();
    }

    @RequestMapping("doTestOne")
    @HystrixCommand
    public String two() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:8083/doTest", String.class);

        return "服务的消费者-------" + forEntity.getBody();
    }
}
