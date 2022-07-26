package com.example.demo1other;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession
public class Demo1OtherApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo1OtherApplication.class, args);
    }

}
