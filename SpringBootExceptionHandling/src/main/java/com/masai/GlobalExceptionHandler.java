package com.masai;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> myExceptionHandler(IllegalArgumentException i){
		
		return new ResponseEntity<String>(i.getMessage() ,HttpStatus.BAD_REQUEST);
	}
}
