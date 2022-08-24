package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author zhoujian
 */
@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private RedisTemplate redisTemplate;




}
