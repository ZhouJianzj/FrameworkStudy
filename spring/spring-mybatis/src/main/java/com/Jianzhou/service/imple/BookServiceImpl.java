package com.Jianzhou.service.imple;

import com.Jianzhou.dao.BookDao;
import com.Jianzhou.entites.Book;
import com.Jianzhou.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import java.util.List;
@Component
public class BookServiceImpl implements BookService {
    //在容器中获取对应的创建的对象名称使用 type自动注入，还有一种就是使用resource注解注入，需要指定的是对象的名称value = “id”
    @Autowired
    private BookDao bookDao = null;


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
