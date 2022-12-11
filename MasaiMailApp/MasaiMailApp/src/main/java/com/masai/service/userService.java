package com.masai.service;

import java.util.List;

import com.masai.globalException.emailException;
import com.masai.globalException.loginException;
import com.masai.globalException.userException;
import com.masai.model.email;
import com.masai.model.loginDto;
import com.masai.model.registerDto;
import com.masai.model.user;

public interface userService {
	
	public String registerUser(registerDto user) throws loginException;
	public String loginUser(loginDto user) throws loginException;
	public List<email>getAllMail()throws emailException;
	public List<email> getAllStarredMail() throws emailException;
	public String updateUser(user userDetails)throws userException;
	
	
	

}
