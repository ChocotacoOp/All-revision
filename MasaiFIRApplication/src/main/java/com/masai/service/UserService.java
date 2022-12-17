package com.masai.service;

import java.util.List;

import com.masai.exception.FIRException;
import com.masai.exception.UserException;
import com.masai.model.FIR;
import com.masai.model.User;

public interface UserService {

	public User registerUser(User user)throws UserException;
	public String UserLogin(User user)throws UserException;
	
	public List<FIR> all_FIR()throws FIRException,UserException;
	
	public String DeleteA_FIR(Integer FirId)throws FIRException,UserException;
	

}

