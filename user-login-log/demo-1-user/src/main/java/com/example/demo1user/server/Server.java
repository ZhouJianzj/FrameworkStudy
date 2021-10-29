package com.example.demo1user.server;

import zj.entity.User;

import javax.servlet.http.HttpServletRequest;

public interface Server {
    User userLoginServer(User user, HttpServletRequest request);
}
