package com.masai.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {

	@Id
	private Integer id;
	private String name;
	private String phoneNumber;
	private LocalDate DateOfBirth;
	
	@OneToOne()
	private Email email;
	
}
