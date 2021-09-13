package com.zj.springbootredis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author zhoujian
 */
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    /**
     * 配置好redis的依赖就会自动的注入一个这个redis模板对象
     */
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Override
    public void servicePut(String key, String value) {
        redisTemplate.opsForValue().set(key,value);
    }

    @Override
    public String serviceGet(String name) {
        Object o = redisTemplate.opsForValue().get(name);
        return o.toString();
    }
}
