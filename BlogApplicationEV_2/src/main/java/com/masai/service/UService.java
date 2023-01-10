package com.masai.service;

import com.masai.exception.UserException;
import com.masai.model.User;

public interface UService {
	
	public User createUser(User user)throws UserException;
}
