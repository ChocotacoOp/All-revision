package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class email {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer email_id;
	private String title;
	private String description;
	private Boolean starred;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private user user;


	public Integer getEmail_id() {
		return email_id;
	}


	public void setEmail_id(Integer email_id) {
		this.email_id = email_id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public user getUser() {
		return user;
	}


	public void setUser(user user) {
		this.user = user;
	}


	public Boolean getStarred() {
		return starred;
	}


	public void setStarred(Boolean starred) {
		this.starred = starred;
	}


	public email(Integer email_id, String title, String description, Boolean starred, com.masai.model.user user) {
		super();
		this.email_id = email_id;
		this.title = title;
		this.description = description;
		this.starred = starred;
		this.user = user;
	}


	public email() {
		
	}


	
	
	
	

}
