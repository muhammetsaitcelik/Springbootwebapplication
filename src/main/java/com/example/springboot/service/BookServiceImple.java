package com.example.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.model.Book;
import com.example.springboot.repository.BookRepository;

@Service
public class BookServiceImple implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    @Transactional
    public List<Book> getBooks() {

        return bookRepository.findAll();
    }

    @Override
    @Transactional
    public void saveBook(Book book) {
        // TODO Auto-generated method stub
        bookRepository.save(book);
    }

    @Override
    @Transactional
    public Book getBook(int id) {
        Optional<Book> books = bookRepository.findById(id);
        Book book = null;
        if(books.isPresent()) {
            book = books.get();
        }else {
            throw new RuntimeException("book not found id=" + id);
        }
        return book;
    }

    @Override
    @Transactional
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }

    @Override
    @Transactional
    public List<Book> search(String keyword){
    	
    	return bookRepository.search(keyword);
    }
}