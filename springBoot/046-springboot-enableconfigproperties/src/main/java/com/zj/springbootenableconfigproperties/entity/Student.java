package com.zj.springbootenableconfigproperties.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "student")
@PropertySource("classpath:students.properties")
@Data
public class Student {
    private String name;
    private Integer age;
}
