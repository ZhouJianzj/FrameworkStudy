package com.zhouJian.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("10001")
    private int id;
    @Value("java基础")
    private String bookName;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + bookName + '\'' +
                '}';
    }
}
