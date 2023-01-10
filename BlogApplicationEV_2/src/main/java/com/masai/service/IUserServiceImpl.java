package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.User;
import com.masai.repo.UserRepo;

@Service("IUserService")
public class IUserServiceImpl implements IUserService{
	
	@Autowired
	UserRepo iUserRepo;

	@Override
	public String validateLogin(String email, String password) throws Exception {
		User bean = null;
		try {
			for(User i : iUserRepo.findAll()) {
				if(i.getEmail().equals(email)) {
					if(i.getPassword().equals(password)) {
						return "Authentication Successfull";
					}
					return "User details not found! Invalid details";
				}
			}
		}
		catch(Exception e) {
			throw new Exception("User details not found! Invalid details");
		}
		return "Authentication Successfull";
	}
}