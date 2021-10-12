package com.zj.demoeurekaclientprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoEurekaClientProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaClientProviderApplication.class, args);
    }

}
