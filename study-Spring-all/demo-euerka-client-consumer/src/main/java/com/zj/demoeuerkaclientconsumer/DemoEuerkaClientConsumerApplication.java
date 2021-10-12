package com.zj.demoeuerkaclientconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoEuerkaClientConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEuerkaClientConsumerApplication.class, args);
    }

}
