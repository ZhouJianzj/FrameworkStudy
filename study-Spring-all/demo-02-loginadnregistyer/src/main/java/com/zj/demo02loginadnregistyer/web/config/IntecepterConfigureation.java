package com.zj.demo02loginadnregistyer.web.config;

import com.zj.demo02loginadnregistyer.web.Handler.InterceptorHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author zhoujian
 */

@Configuration
public class IntecepterConfigureation  implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String [] addPathPatterns = {"/**"};
        String [] excludePathPatterns = {
                "/login"
        };
        registry.addInterceptor(new InterceptorHandler())
                .addPathPatterns(addPathPatterns)
                .excludePathPatterns(excludePathPatterns);
    }

}
