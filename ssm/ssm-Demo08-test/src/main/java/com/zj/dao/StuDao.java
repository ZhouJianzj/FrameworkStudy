package com.zj.dao;


import com.zj.eneties.Stu;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zhoujian
 */
public interface StuDao {
    @Select("select * from student where id = #{id}")
    @ResultType(Stu.class)
    List<Stu> select(int id);
}
