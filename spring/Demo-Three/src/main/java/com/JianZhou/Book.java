package com.JianZhou;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
//@Component("myBook")
@Component
public class Book {
    //使用value注解可以不需要写set方法，这样赋值是不需要通过set方法实现的
    @Value(value = "1001")
    private  int id;
    @Value(value = "周健")
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Book() {
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
