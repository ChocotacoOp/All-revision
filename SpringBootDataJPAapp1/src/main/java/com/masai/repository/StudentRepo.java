package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Student;

// the spring data JPA f/w will provide the implementation of this object 
//and register that implementation class object with Spring container as a spring bean

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
