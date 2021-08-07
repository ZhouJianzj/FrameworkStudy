package com.zj.consumer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zhoujian
 */
@RestController
public class Controller {
    /**
     * 使用配置类的方式创建对象
     */
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("test")
    public String doTest(){
//        现在需要调用服务提供者提供的服务
        //1、需要创建一个能以http协议访问的服务提供者的对象,亦可以使用配置类的方式去创建对象
        //RestTemplate restTemplate = new RestTemplate();

        //2、一个get方式向服务提供者发送请求，返回一个请求对象实体
            //参数一：服务提供者的url
            //参数二：服务提供者的返回值类型
            //参数三：传递个服务提供者的参数，是一个可变长的参数
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:8081/test", String.class);
        //3、返回的数据都是rest风格的数据都是string类型的json数据
        String body = forEntity.getBody();
        System.out.println("getStatusCode():" + forEntity.getStatusCode());
        System.out.println("getHeaders():" + forEntity.getHeaders());
        System.out.println("getStatusCodeValue():" + forEntity.getStatusCodeValue());
        return "第一个 spring cloud 消费者" + body;
    }
}
