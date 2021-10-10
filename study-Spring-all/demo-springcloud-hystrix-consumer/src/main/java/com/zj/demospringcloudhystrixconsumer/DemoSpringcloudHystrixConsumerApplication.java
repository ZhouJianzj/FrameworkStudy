package com.zj.demospringcloudhystrixconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class DemoSpringcloudHystrixConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringcloudHystrixConsumerApplication.class, args);
    }

}
