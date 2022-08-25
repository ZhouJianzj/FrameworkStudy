package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * @author zhoujian
 */
public interface UserService {
    List<User> selectUserAll();
}
