package com.masai.service;

import org.springframework.stereotype.Service;

import com.masai.exception.UserException;
import com.masai.model.User;
import com.masai.repo.UserRepo;

@Service
public class UserServiceImpl implements UService{
	
	private UserRepo urepo;

	@Override
	public User createUser(User user) throws UserException {
		
		User existingUser = urepo.findByEmail(user.getEmail());
		if(existingUser!=null) {
			throw new UserException("Customer already Exist with this Email !");
		}
		else
			return urepo.save(user);
	}

}
