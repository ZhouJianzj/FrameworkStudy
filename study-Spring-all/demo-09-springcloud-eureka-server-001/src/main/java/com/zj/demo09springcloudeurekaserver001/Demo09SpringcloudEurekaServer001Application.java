package com.zj.demo09springcloudeurekaserver001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Demo09SpringcloudEurekaServer001Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo09SpringcloudEurekaServer001Application.class, args);
    }

}
