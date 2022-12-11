package com.masai.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.globalException.loginException;
import com.masai.model.registerDto;
import com.masai.service.userService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class userController {
	
	@Autowired
	private userService uservice;
	
	@PostMapping("/masaimail/register")
	public ResponseEntity<String> registerUser(@RequestBody registerDto user)throws loginException{
		
		String result= uservice.registerUser(user);
		
		return new ResponseEntity<String>(result,HttpStatus.CREATED);
	}
	

}
