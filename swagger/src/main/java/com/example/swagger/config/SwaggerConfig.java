package com.example.swagger.config;


import com.example.swagger.annotation.IgnoreApi;
import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


/**
 * @author zhoujian
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket newDocket(){
// 指定自己的大标题
        //指定使用的swagger版本
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        //构建自己的apiInfo
        ApiInfo apiInfo = new ApiInfoBuilder()
                .contact(new Contact(
                        "管道项目",
                        "https://github.com/ZhouJianzj/project.git",
                        "2998390669@qq.com"
                ))
                .title("管道项目")
                .description("管道项目的API帮助文档")
                .version("1.0.1")
                .build();

        //docket中添加自己的定制信息
        docket.apiInfo(apiInfo);



//  对控制器的配置
        docket
                //获取docket中的api扫描器
                .select()
                //请求选择器  指定使用自定义注解的时候忽略生成api
                .apis(
                        Predicates.and(
                                //断言取反的操作
                                Predicates.not(RequestHandlerSelectors.withMethodAnnotation(IgnoreApi.class)),
                                //指定扫描的控制器路劲
                                RequestHandlerSelectors.basePackage("com.example.swagger")
                        )

                )
                //路劲选择器  指定符合正则表达式的路径生成api
                .paths(
                        Predicates.or(
                                PathSelectors.regex("/hello/.*"),
                                //表示所有
                                PathSelectors.regex("/.*")
                        )

                )
                .build();
        return docket;
    }
}
