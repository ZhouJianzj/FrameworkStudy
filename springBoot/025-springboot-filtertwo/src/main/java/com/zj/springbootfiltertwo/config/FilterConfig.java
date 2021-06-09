package com.zj.springbootfiltertwo.config;

import com.zj.springbootfiltertwo.filter.FilterOne;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean myFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new FilterOne());
//       注意的是当使用的  **  的时候就会进入过滤器,，多级的话就是用*，与拦截器不一样
        filterRegistrationBean.addUrlPatterns("/test/*");
        return filterRegistrationBean;
    }
}
