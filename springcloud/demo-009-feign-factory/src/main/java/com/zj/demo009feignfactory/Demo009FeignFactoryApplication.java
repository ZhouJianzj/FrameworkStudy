package com.zj.demo009feignfactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Demo009FeignFactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo009FeignFactoryApplication.class, args);
    }

}
