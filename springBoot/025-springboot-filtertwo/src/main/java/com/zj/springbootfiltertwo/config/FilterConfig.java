package com.zj.springbootfiltertwo.config;

import com.zj.springbootfiltertwo.filter.FilterOne;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new FilterOne());
        filterRegistrationBean.addUrlPatterns("/test/*");
        return filterRegistrationBean;
    }
}
