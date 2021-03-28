package com.zhoujian.dao;

import com.zhoujian.entity.Student;
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
   public abstract List selectMethod();


}
