package com.zj.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 解决 cors 问题的
 * @author zhoujian
 */
@Configuration
public class MyWebMVCConfiguration implements  WebMvcConfigurer {
       @Override
       public void addCorsMappings(CorsRegistry registry) {
           registry.addMapping("/**/**");
       }



//    没有实现WebMvcConfigurer的时候可以这样

//    @Bean
//    public WebMvcConfigurer newWebMvcConfigurer(){
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**/**");
//            }
//        };
//    }
}
