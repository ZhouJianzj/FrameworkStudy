package com.zj.demo13springcloudeurekaclientto9200consumed9100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Demo13SpringcloudEurekaClientTo9200Consumed9100Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo13SpringcloudEurekaClientTo9200Consumed9100Application.class, args);
    }

}
