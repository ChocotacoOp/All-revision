package com.masai.model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Email {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer mail_id;
	private String mail;
	private LocalDate created_date;
	
	@OneToOne(cascade = CascadeType.ALL)
	private User user;
	
	public Email() {
		
	}

	public Integer getMail_id() {
		return mail_id;
	}

	public void setMail_id(Integer mail_id) {
		this.mail_id = mail_id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public LocalDate getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDate created_date) {
		this.created_date = created_date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Email(Integer mail_id, String mail, LocalDate created_date, User user) {
		super();
		this.mail_id = mail_id;
		this.mail = mail;
		this.created_date = created_date;
		this.user = user;
	}
	
	
}
