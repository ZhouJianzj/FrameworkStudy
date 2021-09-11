package com.zj.demo01.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author zhoujian
 */
@Mapper
public interface DaoLogin {

    @Select(value = "select * from login where userName = #{username} and password = #{password}")
    String select(@Param("password") String password, @Param("username") String username);
}
