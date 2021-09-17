package com.zj.springbootpersondefindedapplication.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 使用新的配置,指定参数的前缀，参数的名字要和对象的属性名字一样,这一样就不需要一个一个的使用@Value了就比较高效
 */
@Configuration

@ConfigurationProperties(prefix = "school")
public class School {
    private String name;
    private String address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
