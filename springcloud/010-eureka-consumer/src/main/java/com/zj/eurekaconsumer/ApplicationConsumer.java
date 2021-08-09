package com.zj.eurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationConsumer {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConsumer.class, args);
    }

}
