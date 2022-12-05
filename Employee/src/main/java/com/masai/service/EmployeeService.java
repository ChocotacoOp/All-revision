package com.masai.service;

import java.util.List;

import com.masai.Exception.employeeException;
import com.masai.model.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(Employee employee)throws employeeException;
	public Employee getEmployeeById(Integer id)throws employeeException;
	public Employee getReportingManager(Integer id)throws employeeException;
	public List<Employee> getAllReportees(Integer id)throws employeeException;

}
