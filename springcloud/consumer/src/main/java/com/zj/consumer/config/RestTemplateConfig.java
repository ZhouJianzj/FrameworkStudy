package com.zj.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhoujian
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate newRestTemplate() {
        return new RestTemplate();
    }
}
