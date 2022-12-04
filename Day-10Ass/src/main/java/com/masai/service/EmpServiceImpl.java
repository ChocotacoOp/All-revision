package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.repo.EmployeeRepo;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	private EmployeeRepo erepo;

	@Override
	public Employee AddEmployee(Employee employee) throws EmployeeException {
		
//		Optional<Employee> existemployee= erepo.findById(employee.getEid());
//		
//		if(existemployee.isPresent()) {
//			throw new EmployeeException("This Employee Already Exist !!");
//		}
//		else
			return erepo.save(employee);
	}

	@Override
	public List<Employee> ViewAllEmployee() throws EmployeeException {
		
		List<Employee> allemp= erepo.findAll();
		if(allemp.size()==0) {
			throw new EmployeeException("There is no Employee available !!");
		}else
			return allemp;
	}

	@Override
	public Employee FindEmployeeById(Integer eid) throws EmployeeException {
		Optional<Employee> existemployee= erepo.findById(eid);
		
		if(existemployee.isPresent()) {
			return existemployee.get();
		}
		else
			throw new EmployeeException("No Employee Available with this ID :"+eid);
	}

}
