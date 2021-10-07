package com.zj.demo10springcloudeurekaserver002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class Demo10SpringcloudEurekaServer002Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo10SpringcloudEurekaServer002Application.class, args);
    }

}
