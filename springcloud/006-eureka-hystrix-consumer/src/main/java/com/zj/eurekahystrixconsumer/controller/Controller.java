package com.zj.eurekahystrixconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @RequestMapping("doTest")
    /**
     * 在这个控制器上开启熔断器，
     *      fallbackMethod：指的是当服务的提供者出现了问题之后调用的方法，
     */
    @HystrixCommand(fallbackMethod = "timeOutMethod")
    public String doTest(){
        String forObject = restTemplate.getForObject("http://006-eureka-hystrix-provider/test", String.class);
        return "使用hystrix熔断器的服务消费者------------" + forObject;
    }
    public String timeOutMethod(){
        return "熔断器熔断";
    }
}
