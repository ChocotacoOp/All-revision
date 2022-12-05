package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.employeeException;
import com.masai.dao.EmployeeDao;
import com.masai.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao edao;

	@Override
	public Employee addEmployee(Employee employee) throws employeeException {
		  
		Integer empCheck=employee.getMangerid();
		if(empCheck==null) {
			return edao.save(employee);
		}
		else{
			Optional<Employee>ExEmpl=edao.findTheERManager(empCheck);
			if(ExEmpl.isPresent()) {
				return  edao.save(employee);
			}
			else {
				throw new employeeException("manger not found by mangerid");
			}
			
		}
	}

	@Override
	public Employee getEmployeeById(Integer id) throws employeeException {
	       Optional<Employee>emp=edao.findById(id);
	       
	       if(emp.isPresent()) {
	    	   return emp.get();
	       }
	       throw new employeeException("please put the valid employeeid");
		
	}

	@Override
	public Employee getReportingManager(Integer id) throws employeeException {
		Optional<Employee>emp=edao.findTheERManager(id);
		if(emp.isPresent()) {
			return emp.get();
		}
		
		 throw new employeeException("Manger not found by this id");
	}

	@Override
	public List<Employee> getAllReportees(Integer id) throws employeeException {
		  List<Employee>listEmp=edao.getAllReportees(id);
		  if(listEmp.size()>0) {
			  return listEmp;
		  }
		  throw new employeeException("no repotee found by this id");
	}

}
