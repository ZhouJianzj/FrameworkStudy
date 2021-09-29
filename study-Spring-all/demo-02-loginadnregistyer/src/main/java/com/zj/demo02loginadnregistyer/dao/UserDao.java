package com.zj.demo02loginadnregistyer.dao;

import com.zj.demo02loginadnregistyer.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.sql.ResultSet;
import java.util.List;

@Mapper
public interface UserDao {
    User dLogin(User user);

    Boolean dRegister(User user);

    List<User> select();
}
