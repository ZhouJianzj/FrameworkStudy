package com.JianZhou.service;

import com.JianZhou.entities.Student;

public interface StudentService {
    /**
     * 执行学生插入业务
     * @param student 实体
     * @return  返回值
     */
    int doStudentInsert(Student student);
}
