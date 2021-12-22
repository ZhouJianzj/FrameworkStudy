package com.zj.dao;

import com.zj.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestDao {
    @Select("select username,password from  user")
    List<User> findUsers();
}
