package com.example.springboot.repository;


import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.springboot.model.Book;

@Repository
public interface BookRepository extends JpaRepository <Book,Integer>{

	@Query(value = "SELECT c FROM Book c WHERE c.name LIKE '%' || :keyword || '%'"
            + " OR c.year LIKE '%' || :keyword || '%'"
            + " OR c.isbn LIKE '%' || :keyword || '%'")
	public List<Book> search(@Param("keyword") String keyword);
	
}
