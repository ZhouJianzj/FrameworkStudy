package com.Jianzhou.service;

import com.Jianzhou.entites.Book;

import java.util.List;

public interface BookService {
    /**
     *  调用增加操作
     * @param book
     * @return
     */
    int doInsert(Book book);

    /**
     * 调用检索操作
     * @return
     */
    List<Book> doSelect();
}
