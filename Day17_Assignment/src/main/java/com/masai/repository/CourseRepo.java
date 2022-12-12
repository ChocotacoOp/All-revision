package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Course;
import com.masai.model.Student;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer>{


}
