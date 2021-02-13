package com.example.springboot.controller;

import com.example.springboot.model.Book;
import com.example.springboot.service.BookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/library")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/bookList")
    public String getBooks(Model theModel) {

        List<Book> theBooks = bookService.getBooks();
        theModel.addAttribute("books",theBooks);

        return "/book-list";
    }

    @GetMapping("/")
    public String Homepage() {
        return "bookhome";
    }
}