package com.atguigu.web;

import com.atguigu.entity.Book;
import com.atguigu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public ModelAndView getList(){
        ModelAndView modelAndView=new ModelAndView("list");
        List<Book> books = bookService.listAll();
        modelAndView.addObject("book",books);
        return modelAndView;
    }
}
