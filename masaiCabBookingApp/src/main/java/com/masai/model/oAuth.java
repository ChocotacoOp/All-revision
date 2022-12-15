package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class oAuth {
	
	
	@Id
	private String mobileNumber;
	private String password;
	
	public String getEmail() {
		return mobileNumber;
	}
	public void setEmail(String email) {
		this.mobileNumber = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public oAuth(String email, String password) {
		super();
		
		this.mobileNumber = email;
		this.password = password;
	}
	public oAuth() {
		
	}
	@Override
	public String toString() {
		return "oAuth [email=" + mobileNumber + ", password=" + password + "]";
	}
	
	

}
