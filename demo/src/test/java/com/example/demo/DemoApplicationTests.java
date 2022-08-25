package com.example.demo;

import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        userService.selectUserAll()
                .stream()
                .forEach(user -> System.out.println(user.getId() + "--" + user.getName() + "--" + user.getAge()));
    }
}
