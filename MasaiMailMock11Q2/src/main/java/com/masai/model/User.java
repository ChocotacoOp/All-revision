package com.masai.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	String Name;
	String mobileNumber;
	LocalDate dateOfBirth;
	@OneToMany(cascade = CascadeType.ALL)
	List<Email> inbox;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public List<Email> getInbox() {
		return inbox;
	}
	public void setInbox(List<Email> inbox) {
		this.inbox = inbox;
	}
	public User(Integer id, String name, String mobileNumber, LocalDate dateOfBirth, List<Email> inbox) {
		super();
		this.id = id;
		Name = name;
		this.mobileNumber = mobileNumber;
		this.dateOfBirth = dateOfBirth;
		this.inbox = inbox;
	}
	
	
	public User() {
		
	}
	
}
