package com.zhoujian.dao;

import com.zhoujian.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public interface StudentDao {
    /**
     * 查询学生
     */
     List<Student> selectMethod();
    /**
     * 插入
     */
    int insertMethod(Student student);
    /**
     * 更新, mybatis.xml文件中的变量与@param（id）中的id一样
     */
    int updateMethod(@Param("id")int id, @Param("name")String name);

}

