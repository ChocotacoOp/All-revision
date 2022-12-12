package com.masai.service;

import java.util.List;

import com.masai.exceptions.StudentException;
import com.masai.model.Course;
import com.masai.model.Student;

public interface CourseService {
	
	public Course getCourseById(Integer courseId) throws StudentException;
	
	public List<Course> getAllCourse() throws StudentException;
	
	public Course updateCourse(Course course)throws StudentException;
	
	public Course deleteCourse(Integer courseId)throws StudentException;
	
	public Course addCourse(Course course);

}
