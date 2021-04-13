package com.Jianzhou.service.imple;

import com.Jianzhou.dao.BookDao;
import com.Jianzhou.entites.Book;
import com.Jianzhou.service.BookService;


import java.util.List;

public class BookServiceImpl implements BookService {
    private BookDao bookDao = null;

    /**
     * 使用构造方法注入
     * @param bookDao
     */
    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    /**
     * 使用set注入
     * @param bookDao
     */
    public void setBookDao(BookDao bookDao) {
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
