package com.example.spring.mongodb.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.mongodb.api.model.Book;
import com.example.spring.mongodb.api.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public Book saveBook(Book book) {
		bookRepository.save(book);
		return book;
	}
	
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	
	public List<Book> getBooksByAuthorName(String authorName) {
		return bookRepository.findByAuthorName(authorName);
	}
	
	public Optional<Book> getBook(int bookId) {
		return bookRepository.findById(bookId);
	}
	
	public void deleteBook(int bookId) {
		bookRepository.deleteById(bookId);		
	}
}