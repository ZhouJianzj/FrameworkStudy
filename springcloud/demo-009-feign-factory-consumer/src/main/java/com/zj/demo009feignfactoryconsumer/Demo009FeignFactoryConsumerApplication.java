package com.zj.demo009feignfactoryconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Demo009FeignFactoryConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo009FeignFactoryConsumerApplication.class, args);
    }

}
