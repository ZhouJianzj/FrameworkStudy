package com.zhouJian.dao;

import com.zhouJian.entities.Book;

import java.util.List;


public interface BookDao {
    List<Book> doSelect();

    int doInsert(Book book);
}
