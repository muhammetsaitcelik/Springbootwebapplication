package com.example.springboot.controller;

import com.example.springboot.model.Book;
import com.example.springboot.service.BookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    
    @GetMapping("/search")
    public String search(@RequestParam String keyword,Model theModel) {
    	List<Book> result = bookService.search(keyword);
	    
	    theModel.addAttribute("books", result);
	   
	    return "/search";    
	}
}