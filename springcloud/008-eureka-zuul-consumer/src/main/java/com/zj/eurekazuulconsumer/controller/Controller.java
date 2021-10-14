package com.zj.eurekazuulconsumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


@RestController
public class Controller {
    @Resource
    private RestTemplate restTemplate;

    /**
     *主要演示的是使用到zuul对服务的控制转发，使用到里面的拦截器验证了taken值
     * @return
     */
    @RequestMapping("/doTest")
    public String doTest(){
        //没有token的时候会报错误
        StringBuffer url = new StringBuffer();
        url.append("http://008-eureka-zuul/zhoujian/test");
        //去掉下面的代码实现权限的验证
        url.append("?token=123");
        String s = url.toString();
        String body = restTemplate.getForObject(s, String.class);
        return  "服务消费者------"+ body;
    }

    /**
     * 演示zuul忽略地址时候，出现404
     */
    @RequestMapping("/testIgnore")
    public void testIgnore(){
        restTemplate.getForObject("http://008-eureka-zuul/zhoujian/testIgnore",String.class);
    }
    /**
     *演示访问zuul自己的控制器，实现网关的自我转发
     * @return
     */
    @RequestMapping("/doTestGate")
    public String doTestTwo(){
        return restTemplate.getForObject("http://008-eureka-zuul/do/t?token=123", String.class);
//        return "doTestGate";
    }
}
