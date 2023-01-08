package com.masai.service;

import java.util.List;

import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.User;

public interface User_EmailService {

	public List<User> retrieveAllUsers()throws UserException;
	public User createUser(User user)throws UserException;
	public User retrieveUserById(Integer id)throws UserException;
	public String DeleteUser(Integer id) throws UserException;
	
	public Email retrieveEmailforUser(Integer id, Integer mail_id)throws Exception;
	public Email CreateEmailForAUser(Integer id, Email mail)throws UserException;
}
