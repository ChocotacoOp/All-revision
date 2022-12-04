package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.UserException;
import com.masai.model.User;
import com.masai.service.UService;

@RestController
public class UserController {

	@Autowired
	private UService us;
	
	@PostMapping
	public ResponseEntity<User> createNewUser(@RequestBody User user) throws UserException {
		User newUser= us.createUser(user);
		return new ResponseEntity<User>(newUser,HttpStatus.CREATED);
	}
}
