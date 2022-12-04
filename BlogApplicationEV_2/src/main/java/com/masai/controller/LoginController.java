package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.LoginException;
import com.masai.model.LoginDTO;
import com.masai.service.LoginService;




@RestController
public class LoginController {
	
	@Autowired
	private LoginService logService;
	
	@PostMapping("/login")
	public ResponseEntity<String> logIntoAccountHandler(@RequestBody LoginDTO dto) throws LoginException {
		
		System.out.println(dto);
		String str = logService.logIntoAccount(dto);
		
		return new ResponseEntity<String>(str,HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/logout")
	public ResponseEntity<String> logoutFromAccountHandler(@RequestParam String key)throws LoginException{
		String str = logService.logoutFromAccount(key);
		
		return new ResponseEntity<String>(str,HttpStatus.OK);
		
		
		
	}

}
