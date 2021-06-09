package com.zj.springboorcharacterencoding1.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class CharaterFilterConfig  {
//    filter注册中心
    @Bean
    public FilterRegistrationBean myFilterBean(){
//        过滤器对象,类似于自定义的Filter
        CharacterEncodingFilter codeFilter = new CharacterEncodingFilter();
        codeFilter.setForceEncoding(true);
        codeFilter.setEncoding("utf-8");
//        注册中心，注册Filter
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(codeFilter);
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
}
