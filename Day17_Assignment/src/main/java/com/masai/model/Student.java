package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studentId;
	
	private String studentName;
	
	private Integer studentMarks;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer studentId, String studentName, Integer studentMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(Integer studentMarks) {
		this.studentMarks = studentMarks;
	}
	
	
	
	
	
}
