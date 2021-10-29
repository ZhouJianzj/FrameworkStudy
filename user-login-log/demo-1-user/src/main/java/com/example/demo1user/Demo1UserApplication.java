package com.example.demo1user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession
public class Demo1UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(Demo1UserApplication.class, args);
    }

}
