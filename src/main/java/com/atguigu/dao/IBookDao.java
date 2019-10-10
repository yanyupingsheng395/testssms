package com.atguigu.dao;

import com.atguigu.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookDao {
    List<Book> listAll();
}
