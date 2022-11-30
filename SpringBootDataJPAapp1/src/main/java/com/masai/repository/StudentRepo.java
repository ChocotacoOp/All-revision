package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Student;

// the spring data JPA f/w will provide the implementation of this object 
//and register that implementation class object with Spring container as a spring bean

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	public List<Student> findByName(String name);
	public List<Student> findByMarks(Integer marks);
	
	public Student findByAddress(String address);
	
	public List<Student> findByNameOrMarks(String name , Integer marks);
	
}
