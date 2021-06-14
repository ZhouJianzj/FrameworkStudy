package com.zj.springbootpersondefindedapplication.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 使用新的配置
 */
@Component
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