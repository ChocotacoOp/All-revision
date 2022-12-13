package com.masai.model;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class registerDto {
	
	@NotNull
	private String email;
	
    @Pattern(regexp = "[a-zA-Z]+", message = "enter valid name")
	private String firstName;
    
    @Pattern(regexp = "[a-zA-Z]+" ,message = "enter valid name")
	private String lastName;
	
	@Size(min = 10,max = 10, message = "enter valid mobile number")
	private String mobileNumber;
	
	@Past
	private LocalDate dateofbirth;
	
	@Size(min = 6,max = 12, message = "enter correct password")
	private String password;
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public LocalDate getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public registerDto(String email, String firstName, String lastName, String mobileNumber, LocalDate dateofbirth,
			String password) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.dateofbirth = dateofbirth;
		this.password = password;
	}
	public registerDto() {
		
	}
	@Override
	public String toString() {
		return "registerDto [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber="
				+ mobileNumber + ", dateofbirth=" + dateofbirth + ", password=" + password + "]";
	}
	
	
	
	

}
