package com.masai.model;


public class loginDto {
	
	private String mail;
	private String password;
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public loginDto(String mail, String password) {
		super();
		this.mail = mail;
		this.password = password;
	}
	public loginDto() {
		
	}
	@Override
	public String toString() {
		return "loginDto [mail=" + mail + ", password=" + password + "]";
	}
	
	
	

}
