package com.zj.demo12springcloudeurekaclientto9100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Demo12SpringcloudEurekaClientTo9100Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo12SpringcloudEurekaClientTo9100Application.class, args);
    }

}
