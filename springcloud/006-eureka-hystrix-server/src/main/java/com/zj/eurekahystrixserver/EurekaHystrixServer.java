package com.zj.eurekahystrixserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhoujian
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaHystrixServer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHystrixServer.class, args);
    }

}
