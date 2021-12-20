package com.example.mybatis_demo_foreach.service;

import com.example.mybatis_demo_foreach.dao.Dao;
import com.example.mybatis_demo_foreach.entity.Student;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Resource
    private Dao dao;

    public void insertStudents(){
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            students.add( new Student(i,"name" + i));
        }
        dao.insertList(students);
    }
}
