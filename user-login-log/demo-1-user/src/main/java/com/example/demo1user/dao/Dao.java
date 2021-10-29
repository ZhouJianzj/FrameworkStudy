package com.example.demo1user.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import zj.entity.User;

@Mapper
public interface Dao {

    @Select("select * from user where username = #{username} and password = #{password}")
    User UserLoginDao(User user);
}
