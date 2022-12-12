package com.masai.service;

import java.util.List;

import com.masai.exceptions.StudentException;
import com.masai.model.Student;

public interface StudentService {
	
	public Student getStudentById(Integer studentId) throws StudentException;
	
	public List<Student> getAllStudent() throws StudentException;
	
	public Student updateStudent(Student student)throws StudentException;
	
	public Student deleteStudent(Integer studentId)throws StudentException;
	
	public Student addStudent(Student student);

}
