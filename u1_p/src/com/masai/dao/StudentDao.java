package com.masai.dao;

import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Student;
import com.masai.bean.StudentDTO;
import com.masai.exceptions.CourceException;
import com.masai.exceptions.StudentException;

public interface StudentDao {
	
	//interface with all the student details required......
	public String registerStudent(String name,int marks,String email,String password);
	
	
	public String registerStudent2(Student student);
	
	public Student getStudentByRoll(int roll)throws StudentException;
	
	public Student loginStudent(String username,String password)throws StudentException;

	public List<Student> getAllStudentDetails()throws StudentException;
	
	public String registerStudentInACourse(int cid, int roll) throws StudentException,CourceException;

	public List<StudentDTO> getAllStudentsByCname(String cname)throws CourceException;

}
