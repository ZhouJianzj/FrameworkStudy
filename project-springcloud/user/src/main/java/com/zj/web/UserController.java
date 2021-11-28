package com.zj.web;

import com.zj.annotation.IgnoreResponseAdvice;
import com.zj.entities.CommonResponse;
import com.zj.entities.Data;
import com.zj.entities.User;
import com.zj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author zhoujian
 */
@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public User PCDoLogin(@RequestBody User user, HttpServletRequest request) {
        return userService.PSDoLogin(user, request);
    }

    @GetMapping("/noLogin")
    public Data PCDoNoLogin() {
        return new Data("zhoujian", "yangzhou");
    }


    @PutMapping("insert")
    public boolean doInsert(User user) {
        return userService.PSDoInsert(user);
    }

    @DeleteMapping("delete")
    public boolean doDelete(int id) {
        return userService.PSDoDelete(id);
    }


}