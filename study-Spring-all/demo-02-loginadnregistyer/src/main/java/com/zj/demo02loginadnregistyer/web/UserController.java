package com.zj.demo02loginadnregistyer.web;

import com.zj.demo02loginadnregistyer.model.User;
import com.zj.demo02loginadnregistyer.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServer userServer;

    /**
     *
     * @param user
     * @return
     */
    @RequestMapping("/login")
    public User cLogin(User user){
        return userServer.sLogin(user);
    }
    @RequestMapping("/register")
    public Boolean cRegister(User user){
        return userServer.sRegist(user);
    }

    @RequestMapping("/s")
    public List<User> selectAll(){
        return userServer.select();
    }
}
