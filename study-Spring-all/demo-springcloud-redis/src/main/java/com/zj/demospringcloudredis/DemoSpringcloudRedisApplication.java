package com.zj.demospringcloudredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableRedisRepositories
public class DemoSpringcloudRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringcloudRedisApplication.class, args);
    }

}
