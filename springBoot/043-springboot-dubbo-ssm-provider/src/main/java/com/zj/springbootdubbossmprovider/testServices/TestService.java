package com.zj.springbootdubbossmprovider.testServices;

import com.zj.springbootdubbossmprovider.mapper.ChengShiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author zhoujian
 */
@Service
public class TestService {
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Autowired
    private ChengShiMapper chengShiMapper;

    public String testMybatis() {
        return chengShiMapper.selectByPrimaryKey(1).toString();
    }

    public String testRedis() {
        return redisTemplate.opsForValue().get("name").toString();
    }
}

