package com.jianZhou.dao;

import com.jianZhou.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName StudentDao.xml
 * @Description TODO
 * @Author Administrator
 * @Date 2021/3/21
 **/
public interface StudentDao {
    /**
     * 查询
     */
    Student selectMethod();

    /**
     * 插入
     */
    void insertMethod();

    @Select("select *  from student where id = #{id}")
    @ResultType(Student.class)
     Student select(@Param(value = "id") Integer id);
}
