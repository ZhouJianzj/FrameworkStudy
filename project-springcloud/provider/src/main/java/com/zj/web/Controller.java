package com.zj.web;

import com.zj.entities.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/user")
public class Controller {

    @PostMapping("/login")
    public User PCDoLogin(@RequestBody User user) {
        return user;
    }

}
