package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.StudentException;
import com.masai.model.Student;
import com.masai.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	private StudentService empService;
	
	@GetMapping("/students/{studentid}")
	public ResponseEntity<Student> getEmployeeById(@PathVariable("studentid") Integer studentid) throws StudentException{
		Student employee = empService.getStudentById(studentid);
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}
	
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllEmployeeByReportingMsnagerId() throws StudentException{
		List<Student> employee = empService.getAllStudent();
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}
	
	@DeleteMapping("/students/{studentid}")
	public ResponseEntity<Student> deleteEmployeeByIdHandlet(@PathVariable("studentid") Integer studentid) throws StudentException{
		Student employee = empService.deleteStudent(studentid);
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}
	
	@PostMapping("/students")
	public ResponseEntity<Student> addEmployeeHandler(@RequestBody Student emp){
		Student employee = empService.addStudent(emp);
		return new ResponseEntity<>(employee,HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/students")
	public ResponseEntity<Student> updateEmployeeHandler(@RequestBody Student emp) throws StudentException{
		Student employee = empService.updateStudent(emp);
		return new ResponseEntity<>(employee,HttpStatus.ACCEPTED);
	}
	
	
	

}
