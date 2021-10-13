package com.zj.demospringcloudredis.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Set;


@RestController
public class Controller {

    @Resource
    private RedisTemplate<Object ,Object> redisTemplate;

    @RequestMapping("testRedis")
    public String testRedis (){
//        Set keys = redisTemplate.keys("*");
//        keys.forEach(key -> System.out.println(key));

        return (String) redisTemplate.opsForValue().get("name");
    }
}
