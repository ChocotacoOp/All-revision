package com.masai.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
	
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private Integer[] currentPosition;
	private String password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Integer[] getCurrentPosition() {
		return currentPosition;
	}
	public void setCurentPosition(Integer[] currentPosition) {
		this.currentPosition = currentPosition;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public User(Integer id, String firstName, String lastName, String mobileNumber, Integer[] currentPosition,
			String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.currentPosition = currentPosition;
		this.password = password;
	}
	
	
	public User(String firstName, String lastName, String mobileNumber, Integer[] currentPosition, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.currentPosition = currentPosition;
		this.password = password;
	}
	public User() {
	
	}
	
	@Override
	public String toString() {
		return "user [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber="
				+ mobileNumber + ", currentPosition=" + Arrays.toString(currentPosition) + ", password=" + password + "]";
	}
	
}
