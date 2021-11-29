package com.example.spring.mongodb.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.spring.mongodb.api.model.Book;
import com.example.spring.mongodb.api.repository.BookRepository;
import com.example.spring.mongodb.api.service.BookService;

@SpringBootTest
class MongodbSpringbootApplicationTests {

	@Autowired
	private BookService bookService;
	
	@MockBean
	private BookRepository bookRepository;
	
	@Test
	public void getAllBooksTest() {
		List<Book> listOfBooks = new ArrayList<>();
		listOfBooks.add(new Book(1, "IT", "Jennifer"));
		listOfBooks.add(new Book(2, "Accounting", "Tom"));
		
		when(bookRepository.findAll()).thenReturn(listOfBooks);
		assertEquals(2, bookService.getAllBooks().size());
	}
	
	@Test
	public void getBookByAuthorName() {
		List<Book> listOfBooks = new ArrayList<>();
		listOfBooks.add(new Book(3, "Security", "Eric"));
		
		String authorName = "Eric";
		when(bookRepository.findByAuthorName(authorName)).thenReturn(listOfBooks);
		assertEquals(1, bookService.getBooksByAuthorName(authorName).size());
	}
	
	@Test
	public void saveBookTest() {
		Book book = new Book(4, "Sport", "Omar");
		when(bookRepository.save(book)).thenReturn(book);
		assertEquals(book, bookService.saveBook(book));
	}
	
	@Test
	public void deleteBook() {
		int bookId = 4;
		bookService.deleteBook(bookId);
		verify(bookRepository, times(1)).deleteById(bookId);
	}
}