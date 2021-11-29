package com.example.spring.mongodb.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.spring.mongodb.api.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{
	List<Book> findByAuthorName(String authorName);
}
