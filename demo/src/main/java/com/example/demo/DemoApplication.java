package com.example.demo;

import com.example.demo.configuration.Config;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author zhoujian
 */
@SpringBootApplication
@Import(value = {Config.class})
public class DemoApplication {
//    public static void main(String[] args) {
//        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
//        RedisTemplate redisTemplate = (RedisTemplate) run.getBean("redisTemplate");
//        Object execute = redisTemplate.execute(new RedisCallback() {
//            @Override
//            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
//                return redisConnection.ping();
//            }
//        });
//        System.out.println(execute);
//    }

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
    }


}
