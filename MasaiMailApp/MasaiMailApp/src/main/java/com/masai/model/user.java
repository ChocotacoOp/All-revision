package com.masai.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class user {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer userid;
    
	private String email;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private LocalDate dateofbirth;
	
	


	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public LocalDate getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}


	public user(String email, String firstName, String lastName, String mobileNumber,
			LocalDate dateofbirth ) {
		super();
		
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.dateofbirth = dateofbirth;
		
	}
	
public user(Integer userid, String email, String firstName, String lastName, String mobileNumber,
			LocalDate dateofbirth) {
		super();
		this.userid = userid;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.dateofbirth = dateofbirth;
	}

//	public user(String email, String firstName, String lastName, String mobileNumber, LocalDate dateofbirth) {
//		super();
//		this.email = email;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.mobileNumber = mobileNumber;
//		this.dateofbirth = dateofbirth;
//	}

	public user() {
		
	}
	
	
	
	

}
