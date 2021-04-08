package com.Jianzhou.service.imple;

import com.Jianzhou.dao.BookDao;
import com.Jianzhou.entites.Book;
import com.Jianzhou.service.BookService;


import java.util.List;

public class BookServiceImpl implements BookService {
    private BookDao bookDao = null;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public int doInsert(Book book) {
        int i = bookDao.insertBook(book);
        return i;
    }

    @Override
    public List<Book> doSelect() {
        List<Book> books = bookDao.selectBook();
        return books;
    }
}
