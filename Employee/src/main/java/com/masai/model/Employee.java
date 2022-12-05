package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.Id;

;

@Entity
public class Employee {

	 @Id
	 private Integer employeeid;
	 private String firstName;
	 private String lastName;
	 private String email;
	 private String phoneNumber;
	 private double salary;
	 
	 private Integer mangerid;

	public Integer getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Integer getMangerid() {
		return mangerid;
	}

	public void setMangerid(Integer mangerid) {
		this.mangerid = mangerid;
	}

	public Employee(Integer employeeid, String firstName, String lastName, String email, String phoneNumber,
			double salary, Integer mangerid) {
		super();
		this.employeeid = employeeid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		this.mangerid = mangerid;
	}

	public Employee() {
		
	} 
	 

}
