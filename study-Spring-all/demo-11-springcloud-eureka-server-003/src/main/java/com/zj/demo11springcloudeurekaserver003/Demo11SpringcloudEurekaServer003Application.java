package com.zj.demo11springcloudeurekaserver003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class Demo11SpringcloudEurekaServer003Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo11SpringcloudEurekaServer003Application.class, args);
    }

}
