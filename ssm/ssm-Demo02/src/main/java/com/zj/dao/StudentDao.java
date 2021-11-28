package com.zj.dao;

import com.zj.doMain.Student;

import java.util.List;

public interface StudentDao {
    /**
     * 查询
     *
     * @return 查询返回的list
     */
    List<Student> selectStudents();

    /**
     * 插入
     *
     * @param student 参数对象
     * @return 返回为1表示插入成功
     */
    int insertStudent(Student student);
}
