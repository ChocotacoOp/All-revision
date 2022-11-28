package com.masai.services;

import java.util.List;

import com.masai.exception.BookException;
import com.masai.model.Book;

public interface BookServices {
	
	public Book createNewBook(Book book);
	public List<Book> getAllBooks() throws BookException;
	public Book getBookById(Integer BookId)throws BookException;
	public Book deleteBook(Integer BookId)throws BookException;
	public Book updateBook(Book book)throws BookException;
}
