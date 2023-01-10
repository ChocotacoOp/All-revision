package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.BookException;
import com.masai.model.Book;
import com.masai.services.BookServices;

@RestController
@RequestMapping("/bookservice")
public class BookController {

	@Autowired
	private BookServices bs;
	
	@PostMapping("/books")
	public ResponseEntity<Book> createNewBook(@RequestBody Book book){
		
		Book add = bs.createNewBook(book);
		return new ResponseEntity<Book>(add , HttpStatus.CREATED);
	}
//	===================================================
	@GetMapping("/books/{BookId}")
	public ResponseEntity<Book> getBookById(@PathVariable Integer BookId) throws BookException{
		
		Book book = bs.getBookById(BookId);
		
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
//	=========================================================
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks() throws BookException{
		
		List<Book> list = bs.getAllBooks();
		
		return new ResponseEntity<List<Book>>(list,HttpStatus.OK);
	}
//	=========================================================
	@DeleteMapping("/books/{BookId}")
	public ResponseEntity<Book> deleteBook(@PathVariable Integer BookId) throws BookException{
		
		Book book = bs.deleteBook(BookId);
		return new ResponseEntity<Book>(book, HttpStatus.OK);
	}
//	=======================================================
	@PutMapping("/books")
	public ResponseEntity<Book> updateBook(@RequestBody Book book) throws BookException{
		
		Book updatedBook = bs.updateBook(book);
		
		return new ResponseEntity<Book>(updatedBook,HttpStatus.ACCEPTED);
	}
	
}
