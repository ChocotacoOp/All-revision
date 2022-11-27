package com.masai.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Student {
	
	@NotNull(message = "Invalid roll Number")
	@Min(value = 10 , message = "{roll.invalid}")
	private Integer roll;
	
	@Size(min = 3, max = 8 , message = "{name.invalid}")
	private String name;
	private String address;
	@NotNull(message = "Marks is mandatory")
	@Max(value = 800, message = "marks should be max of 800")
	private Integer marks;

	
	public Student(){
		
	}


	public Integer getRoll() {
		return roll;
	}


	public void setRoll(Integer roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Integer getMarks() {
		return marks;
	}


	public void setMarks(Integer marks) {
		this.marks = marks;
	}


	public Student(Integer roll, String name, String address, Integer marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}
	
	
}
