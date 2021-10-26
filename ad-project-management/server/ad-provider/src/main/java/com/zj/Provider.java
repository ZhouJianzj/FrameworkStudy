package com.zj;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhoujian
 */
@SpringBootApplication
@EnableEurekaClient
public class Provider {
    public static void main(String[] args) {
        SpringApplication.run(Provider.class,args);
    }
}
