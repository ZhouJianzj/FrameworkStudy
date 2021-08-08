package com.zj.eurekafeignconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
//激活feign
@EnableFeignClients
public class EurekaFeignConsumer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignConsumer.class, args);
    }

}
