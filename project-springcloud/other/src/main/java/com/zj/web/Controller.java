package com.zj.web;

import com.zj.entities.Data;
import com.zj.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/other")
public class Controller {
    /**
     * 登录之后才能访问，session共享实现一个用户的数据一致
     *
     * @return
     */
    @GetMapping("/test")
    public User test(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        User user = null;
        if (null != session) {
            user = (User) session.getAttribute("user");
        }
        return user;
    }

}
