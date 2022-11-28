package com.masai.service;

import com.masai.exception.StudentException;
import com.masai.model.Student;

public interface StudentService {

	public Student registerStudent(Student student);
	
	public Student getStudentByRoll(Integer roll) throws StudentException;
	
}
