package com.zj.dao;

import com.zj.entities.Student;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentDao {
    @Select("select name,age from student where id = #{id}" )
    @ResultType(Student.class)
    public List<Student> selectStudent(Integer id);
}
