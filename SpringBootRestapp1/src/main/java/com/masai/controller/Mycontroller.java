package com.masai.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;

//@Controller
@RestController    //it is a combination of @controller @ responsebody
@RequestMapping("/studentApp") //giving uri to root resource
public class Mycontroller {
	
	
	@RequestMapping("/welcome")
//	@ResponseBody
	public String mycontrollerService() {
		return ("welcome to sb ");
	}
	
	
	@RequestMapping("/getStudent")
	public Student getStudeenthandler() {
		Student student = new Student(10,"rajat","khirpai",800);
		return student;
	}
	
//	@RequestMapping(value ="/getAllStudent", method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
	@GetMapping("/getAllStudent")  //shortcut 
	public List<Student> getAllStudent(){
		List<Student> students = Arrays.asList(
				new Student(20, "raj", "khirpai", 100),
				new Student(20, "rahul", "midnapore", 90),
				new Student(20, "kousik", "kolkata", 95),
				new Student(20, "ashim", "chandrakona", 99)
				);
		return students;
	}
	
	
	@GetMapping("/students/{roll}/{name}")
	public Student getStudentByRoll(@PathVariable("roll") Integer roll, @PathVariable("name") String name) {
		Student s = new Student(roll, name, "khirpai", 800);
		
		return s;
	}
	
	
	@GetMapping("/student")  //requestparameter used
	public Student getStudentHandler(@RequestParam("roll") Integer roll) {
		Student student = new Student(roll,"rajat","delhi",880);
		
		return student;
	}
	
	@PostMapping("saveStudent")
	public String saveStudentHandler(@RequestBody Student student) {
		
		
		
		return student.toString()+"saved successfully";
	}
}
