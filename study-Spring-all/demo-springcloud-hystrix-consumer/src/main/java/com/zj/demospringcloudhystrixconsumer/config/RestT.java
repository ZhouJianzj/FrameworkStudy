package com.zj.demospringcloudhystrixconsumer.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestT {

    @Bean
    public RestTemplate newRestTemplate() {
        return new RestTemplate();
    }

}
