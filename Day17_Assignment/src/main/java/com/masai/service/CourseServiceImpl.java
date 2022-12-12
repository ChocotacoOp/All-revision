package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.StudentException;
import com.masai.model.Course;
import com.masai.repository.CourseRepo;
import com.masai.repository.StudentRepo;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseRepo empRepo;

	@Override
	public Course getCourseById(Integer studentId) throws StudentException {
		Optional<Course> opt = empRepo.findById(studentId);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new StudentException("Course not fomd with this ID : "+studentId);
		}
	}

	

	@Override
	public List<Course> getAllCourse() throws StudentException {
		List<Course> opt = empRepo.findAll();
		if(opt.size() !=0) {
				return opt;
		}else {
			throw new StudentException("Course not found");
		}
	}



	@Override
	public Course updateCourse(Course student) throws StudentException {
		Optional<Course> opt = empRepo.findById(student.getCourseId());
		if(opt.isPresent()) {
			Course em = empRepo.save(student);
			return em;
		}else {
			throw new StudentException("Course not found with this ID : "+student.getCourseId());
		}
	}



	@Override
	public Course deleteCourse(Integer studentId) throws StudentException {
		Optional<Course> opt = empRepo.findById(studentId);
		if(opt.isPresent()) {
			empRepo.deleteById(studentId);
			return opt.get();
		}else {
			throw new StudentException("Course not found with this ID : "+studentId);
		}
	}



	@Override
	public Course addCourse(Course student) {
		Course em = empRepo.save(student);
		return em;
	}

}
