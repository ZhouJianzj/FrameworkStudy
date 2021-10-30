package com.zj.method;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * @author zhoujian
 */
public class FunctionMap {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1,"zhoujian","nanjing"));
        users.add(new User(1,"zhoujian","nanjing"));
        users.add(new User(1,"zhoujian","nanjing"));
        users.add(new User(1,"zhoujian","nanjing"));

        users.stream()
//                map方法可以获取指定的对象属性
                .map(User::getName)
//                所有user的name
                .forEach(System.out::println);
    }
}

@Data
@AllArgsConstructor
class User{
    private Integer id;
    private String name;
    private String address;
}
