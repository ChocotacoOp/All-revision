package com.masai.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.masai.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	@Query( nativeQuery = true ,value = "select * from Employee  where employeeid=?1")
	public Optional<Employee> findTheERManager(Integer id);
	
	
	@Query(nativeQuery = true,value = "select * from Employee  where mangerid=?1")
	public List<Employee>getAllReportees(Integer id);

}
