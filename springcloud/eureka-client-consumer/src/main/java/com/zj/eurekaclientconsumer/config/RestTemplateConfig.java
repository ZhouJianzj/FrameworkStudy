package com.zj.eurekaclientconsumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhoujian
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    /**
     * 负载均衡的时候的时候使用，eureka使用的是Ribbon负载均衡，使用这个注册中心必须使用这个负载均衡的注解不然服务无法访问
     */
    @LoadBalanced
    public RestTemplate newRestTemplate(){
        return  new RestTemplate();
    }
}
