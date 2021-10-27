package com.zj.dao;

import com.zj.entities.User;
import org.apache.ibatis.annotations.Mapper;

import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserDao {
    @Select("select * from user where username = #{username} and password = #{password}")
    User PDDoLogin( User user);
}
