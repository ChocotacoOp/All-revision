package com.masai;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {

	@GetMapping("/hello/{id}")
	public ResponseEntity<String> sayHello(@PathVariable("id") Integer id )throws InvalidIdexception {
		
		if(id>=10)
			return new ResponseEntity<String>("welcome to spring boot ",HttpStatus.ACCEPTED);
		else
			throw new InvalidIdexception("Invalid id value ");
	}
	
	

	
	
}
