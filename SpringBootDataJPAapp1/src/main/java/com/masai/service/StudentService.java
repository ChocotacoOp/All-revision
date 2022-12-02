package com.masai.service;

import java.util.List;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.model.StudentDTO;

public interface StudentService {

	public Student registerStudent(Student student);
	
	public Student getStudentByRoll(Integer roll) throws StudentException;
	
	public List<Student> getAllStudents() throws StudentException;
	
	public Student deleteStudentByRoll(Integer roll) throws StudentException;
	
	public Student updateStudentDetails(Student student) throws StudentException;
	
	public Student updateStudentMarks(Integer roll , Integer gmarks) throws StudentException;
	
	public List<Student> getStudentByMarks(Integer marks) throws StudentException;
	
	public List<Student> getStudentByName(String name)throws StudentException;
	
	public Student getStudentByAddress(String address) throws StudentException;
	
	public List<Student> getStudentByNameOrMarks(String name,Integer marks) throws StudentException;

	public String getStudentNameByRoll(Integer roll) throws StudentException;

	public List<String> getNameAndMarksByAddress(String address) throws StudentException;
	
	public List<StudentDTO> getNameAndMarksByAddressDTO(String address) throws StudentException;
	
	
}
