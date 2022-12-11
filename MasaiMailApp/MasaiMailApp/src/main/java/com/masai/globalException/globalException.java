package com.masai.globalException;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;



@ControllerAdvice
public class globalException {
	
	@ExceptionHandler(loginException.class)
	public ResponseEntity<myerrorDetails> loginExceptionHandler(loginException se, WebRequest req){
		
		myerrorDetails err= new myerrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(se.getMessage());
		err.setDetails(req.getDescription(false));
		
		return new ResponseEntity<myerrorDetails>(err, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(emailException.class)
	public ResponseEntity<myerrorDetails> emailExceptionHandler(emailException se, WebRequest req){
		
		myerrorDetails err= new myerrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(se.getMessage());
		err.setDetails(req.getDescription(false));
		
		return new ResponseEntity<myerrorDetails>(err, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(userException.class)
	public ResponseEntity<myerrorDetails> userExceptionHandler(userException se, WebRequest req){
		
		myerrorDetails err= new myerrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(se.getMessage());
		err.setDetails(req.getDescription(false));
		
		return new ResponseEntity<myerrorDetails>(err, HttpStatus.NOT_FOUND);
	}
	

}
