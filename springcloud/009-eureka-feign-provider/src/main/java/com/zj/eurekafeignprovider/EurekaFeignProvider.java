package com.zj.eurekafeignprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhoujian
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaFeignProvider {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignProvider.class, args);
    }

}
