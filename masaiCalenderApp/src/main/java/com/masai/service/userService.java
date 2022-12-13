package com.masai.service;



import java.util.List;

import com.masai.Exception.emailException;
import com.masai.Exception.loginException;
import com.masai.Exception.userException;
import com.masai.model.Event;
import com.masai.model.loginDto;
import com.masai.model.registerDto;
import com.masai.model.user;

public interface userService {
	
	public String registerUser(registerDto user) throws loginException;
	public String loginUser(loginDto user) throws loginException;
    public String updateUser(user us)throws userException;
    public List<Event> getEventBytype(String type)throws userException;
	

}
