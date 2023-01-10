package com.masai.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.LoginException;
import com.masai.model.LoginDTO;
import com.masai.model.User;
import com.masai.model.UserSession;
import com.masai.repo.SessionRepo;
import com.masai.repo.UserRepo;


import net.bytebuddy.utility.RandomString;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private UserRepo cRepo;
	@Autowired
	private SessionRepo sRepo;

	@Override
	public String logIntoAccount(LoginDTO dto) throws LoginException {
		
		String str = null;
		User existingCustomer = cRepo.findByEmail(dto.getemail());
		
		
		if(existingCustomer == null) {
			throw new LoginException("Enter a valid mobile number");
		}
		
		Optional<UserSession> validCustomerSessionOpt = sRepo.findById(existingCustomer.getEmail());
		
		if(validCustomerSessionOpt.isPresent()) {
			throw new LoginException("User already logged in with this mobile number");
		}
		
		if(existingCustomer.getPassword().equals(dto.getPassword())) {
			String key = RandomString.make(6);
			
			UserSession cus = new UserSession(existingCustomer.getEmail(),key,LocalDateTime.now());
			
			sRepo.save(cus);
			str = cus.toString();
			
			return str;
		}
		
		return str;
	}

	@Override
	public String logoutFromAccount(String key) throws LoginException {
		
		UserSession cus = sRepo.findByuuId(key);
		
		if(cus == null) {
			throw new LoginException("User not logged in with this number");
		}
		sRepo.delete(cus);
		
		return "Logged out !!!";
	}

}
