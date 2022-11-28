package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(StudentException.class)
	public ResponseEntity<MyErrrorDetails> StudentExceptionhandler(StudentException se,WebRequest web) {
		
		MyErrrorDetails err = new MyErrrorDetails();
		
		err.setTime(LocalDateTime.now());
		err.setMessage(se.getMessage());
//		err.setMessage("Validation Error");
		err.setDescription(web.getDescription(false));
		
		
		return new ResponseEntity<MyErrrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
//==========================================================================================
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrrorDetails> myMNVEHandler(MethodArgumentNotValidException me) {
		
		MyErrrorDetails err = new MyErrrorDetails();
		
		err.setTime(LocalDateTime.now());
//		err.setMessage(me.getMessage());
		err.setMessage("Validation Error");
		err.setDescription(me.getBindingResult().getFieldError().getDefaultMessage());
		
		
		return new ResponseEntity<MyErrrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
//	======================================================================================
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrrorDetails>Exceptionhandler(StudentException se,WebRequest web) {
		
		MyErrrorDetails err = new MyErrrorDetails();
		
		err.setTime(LocalDateTime.now());
		err.setMessage(se.getMessage());
//		err.setMessage("Validation Error");
		err.setDescription(web.getDescription(false));
		
		
		return new ResponseEntity<MyErrrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
}
