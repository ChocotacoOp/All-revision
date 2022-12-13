package com.masai.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.emailException;
import com.masai.Exception.loginException;
import com.masai.Exception.userException;
import com.masai.model.Event;
import com.masai.model.loginDto;
import com.masai.model.oAuth;
import com.masai.model.registerDto;
import com.masai.model.user;
import com.masai.repo.EventRepo;
import com.masai.repo.oAuthDao;
import com.masai.repo.UserRepo;

@Service
public class userSericeImpl implements userService {
	
	@Autowired
	private UserRepo udao;
	
	@Autowired
	private oAuthDao odao;
	
	
	@Autowired
	private EventRepo edao;
	
	
	@Override
	public String registerUser(registerDto user) throws loginException {
		oAuth ex =odao.findByemail(user.getEmail());
		System.out.println(user);
		
		if(ex!=null) {
			throw new loginException("user is already register with this email id");
		}
		else {
			user newuser= new user(user.getEmail(), user.getFirstName(), user.getLastName(), user.getMobileNumber(), user.getDateofbirth());
			udao.save(newuser);
			
			oAuth registeruser= new oAuth(user.getEmail(), user.getPassword());
			odao.save(registeruser);
			return "user is registered";
		}
		
	}

	@Override
	public String loginUser(loginDto user) throws loginException {
		oAuth ex =odao.findByemail(user.getMail());
		System.out.println(user);
		
		if(ex==null) {
			throw new loginException("user is already register with this email");
		}
		else {
			if(ex.getPassword().equals(user.getPassword())){
				return "login is succesfull";
			}
			else {
				return "please enter valid usermail or password";
			}
		}
		
	}

	@Override
	public String updateUser(user us) throws userException {
		Optional<user>olduser=udao.findById(us.getId()); 
		if(olduser.isPresent()) {
			udao.save(us);
			return "user credentials updated";
		}
		else {
			throw new userException("user does not exist by this credentials");
		}
		
	}

	@Override
	public List<Event> getEventBytype(String type) throws userException {
		List<Event>listEvent=edao.getthelistofEvent(type);
		if(listEvent.size()>0) {
			return listEvent;
		}else {
			throw new userException("no event is available by this type");
		}
		
	}


}
