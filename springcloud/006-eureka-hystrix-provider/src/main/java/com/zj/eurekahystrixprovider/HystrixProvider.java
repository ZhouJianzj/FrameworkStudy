package com.zj.eurekahystrixprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhoujian
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HystrixProvider {

    public static void main(String[] args) {
        SpringApplication.run(HystrixProvider.class, args);
    }

}
