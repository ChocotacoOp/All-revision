package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer BookId;
	private String name;
	private String author;
	private String publication;
	private String catagory;
	private Integer pages;
	private Integer price;
	
	public Book() {
		
	}

	public Integer getBookId() {
		return BookId;
	}

	public void setBookId(Integer bookId) {
		BookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Book(Integer bookId, String name, String author, String publication, String catagory, Integer pages,
			Integer price) {
		super();
		BookId = bookId;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.catagory = catagory;
		this.pages = pages;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", name=" + name + ", author=" + author + ", publication=" + publication
				+ ", catagory=" + catagory + ", pages=" + pages + ", price=" + price + "]";
	}
	
}
