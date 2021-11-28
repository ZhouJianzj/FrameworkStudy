package com.zj.loadbalanceconsumer.conf;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
    @Bean
    @LoadBalanced
    public RestTemplate newR() {
        return new RestTemplate();
    }

    /**
     * 改变负载均衡策略，是由随机的策略，系统默认的是轮询的策略
     */
    @Bean
    public RandomRule newRandomRule() {
        return new RandomRule();
    }

}
