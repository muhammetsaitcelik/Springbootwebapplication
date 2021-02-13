package com.example.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springboot.model.Book;


@Repository
public interface BookRepository extends JpaRepository <Book,Integer>{

	Book findByName(String Bookname);
}
