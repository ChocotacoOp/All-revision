package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepo sRepo;
	
	@Override
	public Student registerStudent(Student student) {
		
		Student saveStudent = sRepo.save(student);
		
		return saveStudent;
	}

	@Override
	public Student getStudentByRoll(Integer roll) throws StudentException {

//		Optional<Student> opt= sRepo.findById(roll);
//		if(opt.isPresent()) {
//		Student student = opt.get();
//		
//		return student;
//		}
//		else
//			throw new StudentException("Student not found with this roll"+roll);
		
//		from java 8 we have short method 
		return sRepo.findById(roll).orElseThrow(()-> new StudentException("Student does not exist with Roll:"+roll));
		
	}

}
