package com.JianZhou.dao;

import com.JianZhou.entities.Student;
import org.apache.ibatis.annotations.Insert;

public interface StudentDao {
    /**
     * 学生的插入
     * @param student  学生实体
     * @return  sql语句执行的是否成功，成功return 1 反之为 0
     */
    @Insert("insert into student values(#{id},#{name},#{age})")
    int insertStudent(Student student);
}
