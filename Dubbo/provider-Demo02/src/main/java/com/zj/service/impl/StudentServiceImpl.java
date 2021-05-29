package com.zj.service.impl;

import com.zj.model.Student;
import com.zj.service.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public Student findStu(Integer id) {
        Student student = new Student();
        student.setId(id);
        student.setName("周健");
        return student;
    }

    @Override
    public Integer findStuNum() {
        return 48;
    }
}
