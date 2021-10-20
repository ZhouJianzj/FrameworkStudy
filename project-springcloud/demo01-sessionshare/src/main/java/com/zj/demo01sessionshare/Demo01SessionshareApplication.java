package com.zj.demo01sessionshare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession
public class Demo01SessionshareApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01SessionshareApplication.class, args);
    }

}
