package com.zj.demospringcloudeurekafeginconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoSpringcloudEurekaFeginConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringcloudEurekaFeginConsumerApplication.class, args);
    }

}
