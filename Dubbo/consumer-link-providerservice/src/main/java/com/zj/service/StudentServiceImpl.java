package com.zj.service;

import com.zj.entity.Student;

public class StudentServiceImpl implements StudentService {
    @Override
    public Student findStu(Integer id) {
        Student student = new Student();
        student.setId(id);
        student.setName("周健");
        return student;

    }
}
