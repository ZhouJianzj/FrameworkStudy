package com.Jianzhou.dao;

import com.Jianzhou.entites.Book;

import java.util.List;

public interface BookDao {
    int insertBook(Book book);
    List<Book> selectBook();
}
