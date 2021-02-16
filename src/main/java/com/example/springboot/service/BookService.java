package com.example.springboot.service;

import java.util.List;

import com.example.springboot.model.Book;

public interface BookService {

	public List<Book> getBooks();
	public void saveBook(Book book);
	public Book getBook(int id);
	public void deleteBook(int id);
	public List<Book> search(String keyword);
	
}
