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

import com.masai.Exception.employeeException;
import com.masai.model.Employee;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService eservice;
	
	@PostMapping("/api/add-employee")
	public ResponseEntity<Employee> addEmployeeHandler(@RequestBody Employee employee)throws employeeException{
		Employee emp=eservice.addEmployee(employee);
		return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/api/get-employees/{employee-id}")
	public ResponseEntity<Employee>findEmployeById(@PathVariable("employee-id") Integer id)throws employeeException{
		Employee emp=eservice.getEmployeeById(id);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
	
	
	@GetMapping("/api/get-employee-manager/{employee-id}")
	public ResponseEntity<Employee>findMangerById(@PathVariable("employee-id") Integer id)throws employeeException{
		Employee emp=eservice.getReportingManager(id);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
	
	@GetMapping("/api/get-all-reportees/{employee-id}")
	public ResponseEntity<List<Employee>> findAllRepotee(@PathVariable("employee-id") Integer id)throws employeeException{
		List<Employee>listEmp=eservice.getAllReportees(id);
		return new  ResponseEntity<List<Employee>>(listEmp,HttpStatus.OK);
	}
	

}
