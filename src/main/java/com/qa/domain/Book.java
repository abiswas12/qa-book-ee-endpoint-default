package com.qa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String title;
	private String genre;
	private String isbn;
	private String author;

	public Book() {

	}

	public Book(String title, String genre, String isbn) {
		this.title = title;
		this.genre = genre;
		this.isbn = isbn;
	}

	public String getFirstName() {
		return title;
	}

	public void setFirstName(String title) {
		this.title = title;
	}

	public String getSecondName() {
		return genre;
	}

	public void setSecondName(String genre) {
		this.genre = genre;
	}

	public String getBookNumber() {
		return isbn;
	}

	public void setBookNumber(String isbn) {
		this.isbn = isbn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
