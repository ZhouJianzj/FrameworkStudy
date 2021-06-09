package com.zj.springbootservletwo.config;

import com.zj.springbootservletwo.web.ServletOne;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SerlvetConfig {
/**
 *
 使用Bean注解就相当于使用
 <Beans>
 <Bean id="" class=""></Bean>
 </Beans>
 */
    @Bean
    public ServletRegistrationBean myServletRegistrationBean(){
//        注册集成servlet的类，和他的path
        ServletRegistrationBean servletRegistrationBean =
                new ServletRegistrationBean(
                        new ServletOne(),
                        "/zhoujian");
        return servletRegistrationBean;

    }
}
