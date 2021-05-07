package com.JianZhou;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentBook {
    @Value(value = "1001")
    private int id;
    @Value(value = "ZhouJian")
    private String name;
    @Autowired
//    上面是使用的byType下面是byName的实现
//    @Qualifier("book")
    private Book book;

    @Override
    public String toString() {
        return "StudentBook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", book=" + book +
                '}';
    }
}
