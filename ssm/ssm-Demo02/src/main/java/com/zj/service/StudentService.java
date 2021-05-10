package com.zj.service;

import com.zj.doMain.Student;

import java.util.List;

public interface StudentService {
    List<Student> findStudents();
    int addStudent(Student student);
}
