package com.JianZhou;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ClassStu {
    @Value("01")
    private int id;
    @Value("软件班")
    private String name;
   @Resource(name = "stu")
    private Student student;

    @Override
    public String toString() {
        return "ClassStu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
