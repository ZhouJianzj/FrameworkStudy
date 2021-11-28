package com.zj.service.impl;

import com.zj.model.Student;
import com.zj.service.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public Student findStu(Integer id, String name) {
        Student student = new Student();
        student.setName(name);
        student.setId(id);
        return student;
    }
}
