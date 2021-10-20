package com.zj.demo02serssionshare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
public class Demo02SerssionshareApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo02SerssionshareApplication.class, args);
    }

}
