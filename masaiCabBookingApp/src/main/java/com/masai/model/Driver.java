package com.masai.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Driver {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String mobileNumber;
	private String name;
	private String password;
	private Integer[] currentPosition;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobilerNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer[] getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(Integer[] currentPosition) {
		this.currentPosition = currentPosition;
	}
	public Driver(Integer id, String mobileNumber, String name, String password, Integer[] currentPosition) {
		super();
		this.id = id;
		this.mobileNumber = mobileNumber;
		this.name = name;
		this.password = password;
		this.currentPosition = currentPosition;
	}
	public Driver(String mobileNumber, String name, String password, Integer[] currentPosition) {
		super();
		this.mobileNumber = mobileNumber;
		this.name = name;
		this.password = password;
		this.currentPosition = currentPosition;
	}
	public Driver() {
		
	}
	
	@Override
	public String toString() {
		return "Driver [id=" + id + ", mobileNumber=" + mobileNumber + ", name=" + name + ", password=" + password
				+ ", currentPosition=" + Arrays.toString(currentPosition) + "]";
	}
	
		
	
	

}
