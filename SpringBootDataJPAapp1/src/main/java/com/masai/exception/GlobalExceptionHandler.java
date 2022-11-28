package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrrorDetails> myMNVEHandler(MethodArgumentNotValidException me) {
		
		MyErrrorDetails err = new MyErrrorDetails();
		
		err.setTime(LocalDateTime.now());
//		err.setMessage(me.getMessage());
		err.setMessage("Validation Error");
		err.setDescription(me.getBindingResult().getFieldError().getDefaultMessage());
		
		
		return new ResponseEntity<MyErrrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
}
