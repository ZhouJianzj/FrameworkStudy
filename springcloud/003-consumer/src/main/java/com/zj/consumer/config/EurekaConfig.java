package com.zj.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhoujian
 */
@Configuration
public class EurekaConfig {
    @Bean
    @LoadBalanced
    public RestTemplate newR() {
        return new RestTemplate();
    }
}
