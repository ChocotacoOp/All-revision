package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(BookException.class)
	public ResponseEntity<MyErrorDetails> BookExceptionhandler(BookException be,WebRequest web) {
		
		MyErrorDetails err = new MyErrorDetails();
		
		err.setTime(LocalDateTime.now());
		err.setMessage(be.getMessage());
//		err.setMessage("Validation Error");
		err.setDescription(web.getDescription(false));
		
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails>Exceptionhandler(BookException be,WebRequest web) {
		
		MyErrorDetails err = new MyErrorDetails();
		
		err.setTime(LocalDateTime.now());
		err.setMessage(be.getMessage());
//		err.setMessage("Validation Error");
		err.setDescription(web.getDescription(false));
		
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
}
