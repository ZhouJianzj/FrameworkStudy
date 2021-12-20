package com.example.mybatis_demo_foreach.dao;


import com.example.mybatis_demo_foreach.entity.Student;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Dao {
    Boolean insertList(@Param("students") List<Student> students);
}
