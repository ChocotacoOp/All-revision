package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.User;
import com.masai.service.User_EmailService;

@RestController
public class User_EmailController {

	@Autowired
	private User_EmailService Usvs;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> retriveAllUser() throws UserException{
		List<User> users= Usvs.retrieveAllUsers();
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) throws UserException{
		User newUser= Usvs.createUser(user);
		return new ResponseEntity<User>(newUser, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> GetUserById(@PathVariable Integer id) throws UserException{
		User user= Usvs.retrieveUserById(id);
		return new ResponseEntity<User>(user ,HttpStatus.OK);
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer id) throws UserException{
		String message= Usvs.DeleteUser(id);
		return new ResponseEntity<String>(message , HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/users/{id}/mail/{mail_id}")
	public ResponseEntity<Email> retrieveMailDetails(@PathVariable Integer id , @PathVariable Integer mail_id) throws Exception{
		Email mail= Usvs.retrieveEmailforUser(id, mail_id);
		return new ResponseEntity<Email>(mail , HttpStatus.OK);
	}
	
	@PostMapping("/user/{id}/mail")
	public ResponseEntity<Email> createMail(@PathVariable Integer id , @RequestBody Email mail) throws UserException{
		Email create= Usvs.CreateEmailForAUser(id, mail);
		return new ResponseEntity<Email>(create , HttpStatus.CREATED);
	}
	
}
