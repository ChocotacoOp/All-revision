package com.masai;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<MyeErrorDetails> myExceptionHandler(IllegalArgumentException i, WebRequest req){
		
		MyeErrorDetails err = new MyeErrorDetails();
		err.setTime(LocalDateTime.now());
		err.setMessage(i.getMessage());
		err.setDetails(req.getDescription(false));
		
		return new ResponseEntity<MyeErrorDetails>(err ,HttpStatus.BAD_REQUEST);
	}
	
	
	//global exception handler
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyeErrorDetails> myExceptionHandler2(Exception i, WebRequest req){

		MyeErrorDetails err = new MyeErrorDetails();
		err.setTime(LocalDateTime.now());
		err.setMessage(i.getMessage());
		err.setDetails(req.getDescription(false));
		
		return new ResponseEntity<MyeErrorDetails>(err ,HttpStatus.BAD_REQUEST);
	}
	
	
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyeErrorDetails> notFoundhandler(NoHandlerFoundException i, WebRequest req){

		MyeErrorDetails err = new MyeErrorDetails();
		err.setTime(LocalDateTime.now());
		err.setMessage(i.getMessage());
		err.setDetails(req.getDescription(false));
		
		return new ResponseEntity<>(err ,HttpStatus.BAD_REQUEST);
	}
}
 