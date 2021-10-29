package com.zj;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhoujian
 */
@EnableFeignClients
@EnableCircuitBreaker
@SpringBootApplication
@EnableEurekaClient
public class Provider {
    public static void main(String[] args) {
        SpringApplication.run(Provider.class,args);
    }
}
