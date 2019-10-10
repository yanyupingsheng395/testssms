package com.atguigu.service;

import com.atguigu.dao.IBookDao;
import com.atguigu.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceTemp implements BookService {
    @Autowired
    private  IBookDao iBookDao;

    @Override
    public List<Book> listAll() {
        return iBookDao.listAll();
    }
}
