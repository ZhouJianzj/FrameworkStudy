package com.zj;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Common {
    public static void main(String[] args) {
        SpringApplication.run(Common.class,args);
    }
}
