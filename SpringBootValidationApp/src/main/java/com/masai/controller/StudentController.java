package com.masai.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;

@RestController
public class StudentController {

	@PostMapping("/students")
	public ResponseEntity<String> registerStudent(@RequestBody Student student){
		
		//we need to connect to SL + DAL to save supplied data in the database.
		
		return new ResponseEntity<String>("Student saved successfully..!"+student.getName(), HttpStatus.CREATED);
	}
}
