package com.zj.springbootenableconfigproperties.config;

import com.zj.Dog;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(Dog.class)
public class PersonConf {
}
