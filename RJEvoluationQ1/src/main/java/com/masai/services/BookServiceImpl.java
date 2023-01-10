package com.masai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.BookException;
import com.masai.model.Book;
import com.masai.repo.BookRepo;

@Service
public class BookServiceImpl implements BookServices{

	@Autowired
	private BookRepo br;
	
	@Override
	public Book createNewBook(Book book) {	
		Book newBook = br.save(book);
		return newBook;
	}

	@Override
	public List<Book> getAllBooks() throws BookException {
		List<Book> allBook = br.findAll();
		
		if(allBook.size()==0) {
			throw new BookException("There is no Books Available");
		}
		else
			return allBook;
	}

	@Override
	public Book getBookById(Integer BookId) throws BookException {
		
		return br.findById(BookId).orElseThrow(()->new BookException("No Book exist with id:"+BookId));
	}

	@Override
	public Book deleteBook(Integer BookId) throws BookException {
		Optional<Book> book = br.findById(BookId);
		if(book.isPresent()) {
			
			br.delete(book.get());
			return book.get();
		}
		else
			throw new  BookException("No Book found to be deleted with id :"+BookId);
	}

	@Override
	public Book updateBook(Book book) throws BookException {
		Optional<Book> opt = br.findById(book.getBookId());
		if(opt.isPresent()) {
			
			Book updatedBook = br.save(book);
			return updatedBook;
		}
		else
			throw new  BookException("Invalid info provided ");
	}

}
