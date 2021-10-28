package com.zj.dao;

import com.zj.entities.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserDao {
    @Select("select * from user where username = #{username} and password = #{password}")
    User PDDoLogin( User user);

    @Insert("insert into user(username,password) values(#{username},#{password})")
    boolean PDDoInsert(User user);

    @Delete("delete from log where id = #{id}")
    boolean PDDoDelete(int id);
}
