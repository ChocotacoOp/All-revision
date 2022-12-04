package com.masai.model;

public class LoginDTO {
	private String email;
	private String password;
	
	public LoginDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public LoginDTO(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}



	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
