package com.JianZhou.service.impl;

import com.JianZhou.dao.StudentDao;
import com.JianZhou.entities.Student;
import com.JianZhou.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public int doStudentInsert(Student student) {
        return studentDao.insertStudent(student);
    }
}
