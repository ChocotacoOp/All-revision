package com.masai.model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Size(min =10,max=10)
	@NotBlank
	private String mobileNumber;
	@Pattern(regexp = "^[a-zA-Z0-9.\\\\-\\\\/+=@_ ]*$")
	@NotBlank
	private String firstName;
	@Pattern(regexp = "^[a-zA-Z0-9.\\\\-\\\\/+=@_ ]*$")
	@NotBlank
	private String lastName;
	@Pattern(regexp = "/^(?=.\\d)(?=.[a-z])(?=.[A-Z])(?=.[^a-zA-Z0-9])(?!.*\\s).{6,12}$/")
	@NotBlank
	private String password;
    @Min(8)
    private Integer age;
    private String address;
	@Pattern(regexp="^(?i)(Male|Female|Transgender)$",message="Gender should be any of male,female or transgender")
	private String gender;
    @ManyToMany 
	private List<FIR> firFilled;
	
	
    
    
	public List<FIR> getFirFilled() {
		return firFilled;
	}



	public void setFirFilled(List<FIR> firFilled) {
		this.firFilled = firFilled;
	}



	public User() {
		// TODO Auto-generated constructor stub
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}

}
