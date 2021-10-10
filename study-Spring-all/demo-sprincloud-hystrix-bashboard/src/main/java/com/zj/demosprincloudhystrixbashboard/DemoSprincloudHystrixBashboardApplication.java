package com.zj.demosprincloudhystrixbashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DemoSprincloudHystrixBashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSprincloudHystrixBashboardApplication.class, args);
    }

}
