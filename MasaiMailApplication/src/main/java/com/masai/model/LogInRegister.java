package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LogInRegister {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	Integer UserId;
	boolean present;
	
	public LogInRegister() {
		// TODO Auto-generated constructor stub
	}
	
	public LogInRegister(Integer id, Integer userId, boolean present) {
		super();
		this.id = id;
		UserId = userId;
		this.present = present;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return UserId;
	}

	public void setUserId(Integer userId) {
		UserId = userId;
	}

	public boolean isPresent() {
		return present;
	}

	public void setPresent(boolean present) {
		this.present = present;
	}
	
	
	
}

