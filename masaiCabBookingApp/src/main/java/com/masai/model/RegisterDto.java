package com.masai.model;

import java.time.LocalDate;
import java.util.Arrays;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class RegisterDto {
	
	
    @Pattern(regexp = "[a-zA-Z]+", message = "enter valid name")
	private String firstName;
    
    @Pattern(regexp = "[a-zA-Z]+" ,message = "enter valid name")
	private String lastName;
	
	@Size(min = 10,max = 10, message = "enter valid mobile number")
	private String mobileNumber;
	
	
	private Integer[] currentPosition;
	
	@Size(min = 6,max = 12, message = "enter correct password")
	private String password;

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

	public void setCurrentPosition(Integer[] currentPosition) {
		this.currentPosition = currentPosition;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RegisterDto(@Pattern(regexp = "[a-zA-Z]+", message = "enter valid name") String firstName,
			@Pattern(regexp = "[a-zA-Z]+", message = "enter valid name") String lastName,
			@Size(min = 10, max = 10, message = "enter valid mobile number") String mobileNumber,
			Integer[] currentPosition, @Size(min = 6, max = 12, message = "enter correct password") String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.currentPosition = currentPosition;
		this.password = password;
	}

	public RegisterDto() {
		
	}
	

	@Override
	public String toString() {
		return "registerDto [firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
				+ ", currentPosition=" + Arrays.toString(currentPosition) + ", password=" + password + "]";
	}
	
	
	

}
