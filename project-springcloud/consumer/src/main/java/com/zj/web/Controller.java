package com.zj.web;

import com.zj.annotation.IgnoreResponseAdvice;
import com.zj.entities.CommonResponse;
import com.zj.entities.User;

import com.zj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/user")
public class Controller {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @IgnoreResponseAdvice
    public CommonResponse<User> SCDoLogin (@RequestBody User user){
        return  userService.SSDoLogin(user);

    }

    @GetMapping("/noLogin")
    public String SCDoNoLogin(){
        return  userService.SSDoNoLogin();
    }


}
