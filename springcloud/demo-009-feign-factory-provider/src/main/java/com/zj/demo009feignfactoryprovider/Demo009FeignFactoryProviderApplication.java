package com.zj.demo009feignfactoryprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Demo009FeignFactoryProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo009FeignFactoryProviderApplication.class, args);
    }

}
