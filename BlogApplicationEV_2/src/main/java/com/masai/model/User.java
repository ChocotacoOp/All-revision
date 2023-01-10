package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer uid;
	
	@NotNull
	private String name;
	
	@NotNull
	private String email;
	private String password;
	
	
	
	public User() {
		
	}



	public User(Integer uid, @NotNull String name, @NotNull String email, String password) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.password = password;
	}



	public Integer getUid() {
		return uid;
	}



	public void setUid(Integer uid) {
		this.uid = uid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
