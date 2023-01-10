package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.model.Student;
import com.masai.model.StudentDTO;

// the spring data JPA f/w will provide the implementation of this object 
//and register that implementation class object with Spring container as a spring bean

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	public List<Student> findByName(String name);
	public List<Student> findByMarks(Integer marks);
	
	public Student findByAddress(String address);
	
	public List<Student> findByNameOrMarks(String name , Integer marks);
	
	// the above all methods are find by using JPA repository predefined conviction
	//now we are going to use our JPQL using @query annotation 
	//named parameter  
//	@Query("select s.name from Student s where s.roll=:r")
//	public String getStudentNameByRoll(@Param("r") Integer roll);
	
	//positional parameter
	@Query("select s.name from Student s where s.roll=?1")
	public String getStudentNameByRoll(Integer roll);
	
//	getting multiple values
	@Query("select s.name,s.marks from Student s where s.address=?1")
	public List<String> getNameAndMarksByAddress(String address);
	
//	based on the DTO data transfer class  DTO constructor sequence is needed/mandatory and package
//	partially fetch data to a proper object
	@Query("select new com.masai.model.StudentDTO(s.name,s.marks) from Student s where s.address=?1")
	public List<StudentDTO> getNameAndMarksByAddressDTO(String address);
}
