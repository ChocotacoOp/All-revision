package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LogInOut {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	String userMob;
	boolean present;
	
	public LogInOut() {
		// TODO Auto-generated constructor stub
	}

	public LogInOut(Integer id, String userMob, boolean present) {
		super();
		this.id = id;
		this.userMob = userMob;
		this.present = present;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserMob() {
		return userMob;
	}

	public void setUserMob(String userMob) {
		this.userMob = userMob;
	}

	public boolean isPresent() {
		return present;
	}

	public void setPresent(boolean present) {
		this.present = present;
	}
		
}

