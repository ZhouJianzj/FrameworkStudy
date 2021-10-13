package com.example.redistest02.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @RequestMapping("test")
    public String testRedis(){
//        redisTemplate.opsForValue().set("name","zhoujian");
//        System.out.println("=================" + redisTemplate.getClass().getName());
//        redisTemplate.opsForValue().get("name");
//        System.out.println("=================");
        return "success";
    }
}
