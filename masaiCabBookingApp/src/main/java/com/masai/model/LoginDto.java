package com.masai.model;


public class LoginDto {
	
	private String mobileNumber;
	private String password;
	
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginDto(String mobileNumber, String password) {
		super();
		this.mobileNumber = mobileNumber;
		this.password = password;
	}
	public LoginDto() {
		
	}
	
	@Override
	public String toString() {
		return "loginDto [mobileNumber=" + mobileNumber + ", password=" + password + "]";
	}
	
    
	
	

}
