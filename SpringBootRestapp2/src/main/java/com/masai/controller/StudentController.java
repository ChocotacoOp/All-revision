package com.masai.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;

@RestController
public class StudentController {

	private List<Student> students = new ArrayList<>();
	
	public StudentController(){
		
		students.add(new Student(10, "rajat", 800));
		students.add(new Student(20, "rahul", 850));
		students.add(new Student(30, "kousik", 880));
		
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudenthandler(){
		
		return students;
	}
	
	@GetMapping("/students/{roll}")
	public ResponseEntity<Student> getStudentbyRollHandler(@PathVariable("roll") Integer roll) {
		
		List<Student> list= students.stream().filter(s-> s.getRoll()==roll).collect(Collectors.toList());
		
		if(list.size() ==0)
			throw new IllegalArgumentException("student does not exist with roll"+roll);
		
		HttpHeaders hh = new HttpHeaders();
		hh.add("abc", "rajat");
		hh.add("hello", "world");
//		return list.get(0);
		return new ResponseEntity<Student>(list.get(0),hh,HttpStatus.OK);
	}
	
	@PostMapping("/students")
	public ResponseEntity<String> addStudentHandler(@RequestBody Student student){
		
		students.add(student);
		
		return new ResponseEntity<String>("student added successfully !",HttpStatus.CREATED); 
	}
	
	@PutMapping("/students/{roll}")
	public Student updateStudent(@RequestBody Student student, @PathVariable Integer roll) {
		
		boolean flag = false;
		
		for(Student s1 : students) {
			
			if(s1.getRoll()==roll) {
				s1.setName(student.getName());
				s1.setMarks(student.getMarks());

				flag=true;
				break;
			}
			
		}
		if(!flag) {
			throw new IllegalArgumentException("Student not found with roll"+roll);
		}
		
		return student;
	}
	
	@DeleteMapping("/students/{roll}")
	public String deleteStudentByRollhandler(@PathVariable("roll") Integer roll) {
		
		boolean s1 = students.removeIf(s->s.getRoll()==roll);
		
		if(s1) {
			return "student removed succesfully..!";
		}
		else
			throw new IllegalArgumentException("no Student found with that roll number"+roll);
	}
	
	@PutMapping("/studentsgrace/{roll}")
	public String graceMarks(@PathVariable("roll") Integer roll , @RequestParam("gmarks") Integer gmarks) {
		boolean flag = false;
		
		for(Student s1 : students) {
			
			if(s1.getRoll()==roll) {
				s1.setMarks((s1.getMarks())+gmarks);

				flag=true;
				break;
			}
			
		}
		if(!flag) {
			throw new IllegalArgumentException("Student not found with roll"+roll);
		}
	
		return "student marks graced";
	}
	
	
}
