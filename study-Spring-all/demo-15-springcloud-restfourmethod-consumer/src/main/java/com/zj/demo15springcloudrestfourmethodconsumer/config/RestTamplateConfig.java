package com.zj.demo15springcloudrestfourmethodconsumer.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTamplateConfig {

    @Bean
    public RestTemplate newRestTemplate() {
        return new RestTemplate();
    }
}
