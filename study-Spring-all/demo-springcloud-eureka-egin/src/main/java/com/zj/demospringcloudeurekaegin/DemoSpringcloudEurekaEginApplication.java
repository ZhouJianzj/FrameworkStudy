package com.zj.demospringcloudeurekaegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoSpringcloudEurekaEginApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringcloudEurekaEginApplication.class, args);
    }

}
