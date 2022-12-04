package com.masai.model;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserSession {
	@Id
	private String email;
	private String uuId;
	private LocalDateTime localDateTime;
	
	public UserSession() {
		
	}

	public UserSession(String email, String uuId, LocalDateTime localDateTime) {
		super();
		this.email = email;
		this.uuId = uuId;
		this.localDateTime = localDateTime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUuId() {
		return uuId;
	}

	public void setUuId(String uuId) {
		this.uuId = uuId;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	@Override
	public String toString() {
		return "UserSession [email=" + email + ", uuId=" + uuId + ", localDateTime=" + localDateTime + "]";
	}
	
	
	
	
}
