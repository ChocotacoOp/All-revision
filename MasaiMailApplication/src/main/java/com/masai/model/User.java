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
	@GeneratedValue(strategy = GenerationType
	.AUTO)
	Integer id;
	String mailId;
	String firstName;
	String lastName;
	String mobileNumber;
	LocalDate dateOfBirth;
	String password;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "sentTo")
	List<Mail> inbox;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "receivedBy")
	List<Mail> sent;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
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


	public List<Mail> getInbox() {
		return inbox;
	}


	public void setInbox(List<Mail> inbox) {
		this.inbox = inbox;
	}


	public List<Mail> getSent() {
		return sent;
	}


	public void setSent(List<Mail> sent) {
		this.sent = sent;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	 
	
	

	
}
