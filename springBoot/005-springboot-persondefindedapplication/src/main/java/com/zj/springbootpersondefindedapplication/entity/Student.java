package com.zj.springbootpersondefindedapplication.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    /**
     * 使用这样的注解就没有直接使用configurationProperties注解的效率高
     */
    @Value("${student.name}")
    private String name;
    @Value("${student.age}")
    private String age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


}
