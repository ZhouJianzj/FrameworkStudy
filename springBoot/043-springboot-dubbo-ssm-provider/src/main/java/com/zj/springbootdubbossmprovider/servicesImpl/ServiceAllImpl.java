package com.zj.springbootdubbossmprovider.servicesImpl;

import com.zj.springbootdubbossmprovider.mapper.ChengShiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import service.ServiceAll;
@Service
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = ServiceAll.class,version = "1.0",timeout = 1500)
public class ServiceAllImpl implements ServiceAll {
    /**
     * mybatis框架的使用自动创建好了dao层接口实现类，这里是由自动注入
     */
    @Autowired
    private ChengShiMapper chengShiMapper;
    /**
     * 这里是由redis集合springboot的依赖，自动的在容器中创建一个RedisTemplate对象
     */
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 测试mybatis
     * @param id
     * @return
     */
    @Override
    public String mybaitsChengShi(Integer id) {
        return chengShiMapper.selectByPrimaryKey(id).toString();
    }

    /**
     * 测试redis
     * @param name
     * @return
     */
    @Override
    public String redisName(String name) {
        return redisTemplate.opsForValue().get(name).toString();
    }


}
