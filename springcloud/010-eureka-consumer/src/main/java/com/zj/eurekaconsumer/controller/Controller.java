package com.zj.eurekaconsumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class Controller {
    @Resource
    private  RestTemplate restTemplate;
    @RequestMapping("doOne")
    public String doOne(){
        String forObject = null;
//        别的服务 有异常发生，需要抛出别的服务的异常的 而不是直接抛出HttpClientErrorException500错误
        try{
           forObject  = restTemplate.getForObject("http://010-eureka-zuul/zhoujian/one", String.class);
        }catch(HttpClientErrorException errorException$Unauthorized){
            return errorException$Unauthorized.getMessage() ;

        }

        return "consumer  execute doOne" + "------" + forObject;
    }
}
