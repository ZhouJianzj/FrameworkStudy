package com.zj.demo05springcloudeuerkaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Demo05SpringcloudEuerkaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo05SpringcloudEuerkaServerApplication.class, args);
    }

}
