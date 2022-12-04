package com.masai.service;

import java.util.List;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public interface EmpService {

	public Employee AddEmployee(Employee employee) throws EmployeeException;
	public List<Employee> ViewAllEmployee()throws EmployeeException;
	
	public Employee FindEmployeeById(Integer eid)throws EmployeeException;
}
