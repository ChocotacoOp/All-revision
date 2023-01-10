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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.model.StudentDTO;
import com.masai.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService sService;
	
	@PostMapping("/students") 
	public ResponseEntity<Student> registerStudent(@RequestBody Student student){
		
		//we need to connect to SL + DAL to save supplied data in the database.
		Student save= sService.registerStudent(student);
		
//		return new ResponseEntity<String>("Student saved successfully..!"+student.toString(), HttpStatus.CREATED);
		return new ResponseEntity<Student>(save, HttpStatus.CREATED);//to use this you have to change method return type
		
	}
	
	@GetMapping("/students/{roll}")
	public ResponseEntity<Student> getStudentByRollHandler(@PathVariable Integer roll) throws StudentException{
		
		Student student = sService.getStudentByRoll(roll);
		
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents() throws StudentException{
		
		List<Student> students = sService.getAllStudents();
		
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/students/{roll}")
	public ResponseEntity<Student> deleteStudentById(@PathVariable Integer roll)throws StudentException{
		
		Student student = sService.deleteStudentByRoll(roll);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
	
	@PutMapping("/students")
	public ResponseEntity<Student> updateStudentHandler(@RequestBody Student student) throws StudentException{
		
		Student updatedStudent = sService.updateStudentDetails(student);
		
		return new ResponseEntity<Student>(updatedStudent,HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/students/{roll}")
	public ResponseEntity<Student> updateStudentMarks(@PathVariable Integer roll , @RequestParam Integer gmarks) throws StudentException{
		Student student = sService.updateStudentMarks(roll, gmarks);
		
		return new ResponseEntity<Student>(student,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getstudents/{marks}")
	public ResponseEntity<List<Student>> getStudentByMarks(@PathVariable("marks") Integer marks) throws StudentException{
		List<Student> students= sService.getStudentByMarks(marks);
		
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	
	@GetMapping("/getbyname/{name}")
	public ResponseEntity<List<Student>> getStudentByName(@PathVariable String name ) throws StudentException{
		
		List<Student> students= sService.getStudentByName(name);
		
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	
	@GetMapping("/getbyaddress/{address}")
	public ResponseEntity<Student> getStudentByAddress(@PathVariable("address") String address) throws StudentException{
		Student student= sService.getStudentByAddress(address);
		
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
	
	@GetMapping("/getbynameormarks/{name}/{marks}")
	public ResponseEntity<List<Student>> getStudentByNameOrMarks(@PathVariable("name") String name, @PathVariable("marks") Integer marks) throws StudentException{
		
		
		List<Student> students= sService.getStudentByNameOrMarks(name, marks);
		
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	
	
	@GetMapping("/getnamebyroll/{roll}")
	public ResponseEntity<String> getStudentNameByRoll(@PathVariable("roll") Integer roll) throws StudentException{
		
		String name = sService.getStudentNameByRoll(roll);
		
		return new ResponseEntity<String>(name,HttpStatus.OK);
	}
	
	//there is problem that string return type returns marks in string so we need to use DTO method
	@GetMapping("/getnamemarks/{address}")
	public ResponseEntity<List<String>> getNameAndMarksByAddr(@PathVariable("address") String address) throws StudentException{
		List<String> results = sService.getNameAndMarksByAddress(address);
		
		return new ResponseEntity<List<String>>(results, HttpStatus.OK);
	}
	
	@GetMapping("/namemarksdto/{address}")
	public ResponseEntity<List<StudentDTO>> getNameMarksByAddDTO(@PathVariable("address") String address) throws StudentException{
		
		List<StudentDTO> list= sService.getNameAndMarksByAddressDTO(address);
	
		return new ResponseEntity<List<StudentDTO>>(list,HttpStatus.OK);
	}
	
}
