package com.zj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhoujian
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer3 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer3.class,args);
    }
}
