package com.example.spring.mongodb.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Book")
public class Book {	
	@Id
	private int id;
	private String name;
	private String authorName;
	
	public Book(int id, String name, String authorName) {
		this.id = id;
		this.name = name;
		this.authorName = authorName;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authorName=" + authorName + "]";
	}
}
