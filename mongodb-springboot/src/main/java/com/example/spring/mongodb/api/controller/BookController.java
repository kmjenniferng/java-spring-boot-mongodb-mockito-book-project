package com.example.spring.mongodb.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.mongodb.api.model.Book;
import com.example.spring.mongodb.api.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	
	@PostMapping("/addBook")
	public Book saveBook(@RequestBody Book book) {		
		return bookService.saveBook(book);
	}
	
	@GetMapping("/findAllBooks")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}
	
	@GetMapping("/findBookById/{bookId}")
	public Optional<Book> getBookById(@PathVariable int bookId) {
		return bookService.getBook(bookId);
	}
	
	@GetMapping("/findBookByAuthor/{authorName}")
	public List<Book> getBookByAuthorName(@PathVariable String authorName) {
		return bookService.getBooksByAuthorName(authorName);
	}
	
	@DeleteMapping("/deleteBook/{bookId}")
	public String deleteBook(@PathVariable int bookId) {
		bookService.deleteBook(bookId);
		return "Book deleted with id: " + bookId;
	}
}
