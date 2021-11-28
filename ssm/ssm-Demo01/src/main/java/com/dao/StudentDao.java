package com.dao;

import com.entities.Student;

import java.util.List;

public interface StudentDao {
    /**
     * 插入
     *
     * @param student 插入的对象
     * @return 插入时候成功
     */
    int insertStudent(Student student);

    /**
     * 查询
     *
     * @return 查询返回的list
     */
    List<Student> selectStudents();
}
