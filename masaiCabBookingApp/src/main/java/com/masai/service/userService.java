package com.masai.service;



import java.util.List;

import com.masai.Exception.BookingException;
import com.masai.Exception.FindingException;
import com.masai.Exception.LoginException;
import com.masai.Exception.UserException;
import com.masai.model.Driver;
import com.masai.model.LoginDto;
import com.masai.model.RegisterDto;
import com.masai.model.User;

public interface userService {
	
	public String registerUser(RegisterDto user) throws LoginException;
	public String loginUser(LoginDto user) throws LoginException;
	public List<Driver>find_Rider(Integer user_id)throws FindingException;
	public String book_Ride(Integer driverid, Integer x, Integer y) throws BookingException;

}
