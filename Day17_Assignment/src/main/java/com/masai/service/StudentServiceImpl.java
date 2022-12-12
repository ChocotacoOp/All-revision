package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.StudentException;
import com.masai.model.Student;
import com.masai.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo empRepo;

	@Override
	public Student getStudentById(Integer studentId) throws StudentException {
		Optional<Student> opt = empRepo.findById(studentId);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new StudentException("Student not fomd with this ID : "+studentId);
		}
	}

	

	@Override
	public List<Student> getAllStudent() throws StudentException {
		List<Student> opt = empRepo.findAll();
		if(opt.size() !=0) {
				return opt;
		}else {
			throw new StudentException("Student not found");
		}
	}



	@Override
	public Student updateStudent(Student student) throws StudentException {
		Optional<Student> opt = empRepo.findById(student.getStudentId());
		if(opt.isPresent()) {
			Student em = empRepo.save(student);
			return em;
		}else {
			throw new StudentException("Student not found with this ID : "+student.getStudentId());
		}
	}



	@Override
	public Student deleteStudent(Integer studentId) throws StudentException {
		Optional<Student> opt = empRepo.findById(studentId);
		if(opt.isPresent()) {
			empRepo.deleteById(studentId);
			return opt.get();
		}else {
			throw new StudentException("Student not found with this ID : "+studentId);
		}
	}



	@Override
	public Student addStudent(Student student) {
		Student em = empRepo.save(student);
		return em;
	}

}
