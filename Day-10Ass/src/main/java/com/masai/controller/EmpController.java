package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.service.EmpService;

@RestController
public class EmpController {

	
	@Autowired
	private EmpService eserv;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> AddNewEmployee(@RequestBody Employee employee) throws EmployeeException{
		Employee newemp= eserv.AddEmployee(employee);
		
		return new ResponseEntity<Employee>(newemp,HttpStatus.CREATED);
	}
	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getAllEmployee() throws EmployeeException{
		List<Employee> all =eserv.ViewAllEmployee();
		
		return new ResponseEntity<List<Employee>>(all,HttpStatus.OK);
	}
	
	@GetMapping("/employee/{eid}")
	public ResponseEntity<Employee> getEmpById(@PathVariable Integer eid) throws EmployeeException{
		
		Employee emp= eserv.FindEmployeeById(eid);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
}
