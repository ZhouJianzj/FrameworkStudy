package com.Jianzhou.entites;

import org.springframework.stereotype.Component;

@Component
public class Book {

    private Integer id;

    private String name;

    public Book() {
    }

    public Book(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
