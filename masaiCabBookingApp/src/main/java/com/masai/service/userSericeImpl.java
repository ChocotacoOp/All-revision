package com.masai.service;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.BookingException;
import com.masai.Exception.FindingException;
import com.masai.Exception.LoginException;
import com.masai.Exception.UserException;
import com.masai.model.Driver;
import com.masai.model.LoginDto;
import com.masai.model.oAuth;
import com.masai.repository.DriverRepo;
import com.masai.repository.oAuthRepo;
import com.masai.repository.UserRepo;
import com.masai.model.RegisterDto;
import com.masai.model.User;


@Service
public class userSericeImpl implements userService {
	
	@Autowired
	private UserRepo urepo;
	
	@Autowired
	private oAuthRepo arepo;
	
	@Autowired
	private DriverRepo drepo;
	
	
	
	@Override
	public String registerUser(RegisterDto user) throws LoginException{
		oAuth registerUser =arepo.findByemail(user.getMobileNumber());
		
		
		
		if(registerUser!=null) {
			throw new LoginException("user is already register with this mobile Number");
		}
		else {
			User newuser= new User(user.getFirstName(), user.getLastName(), user.getMobileNumber(), user.getCurrentPosition(), user.getPassword());
			urepo.save(newuser);
			
			oAuth registeruser= new oAuth(user.getMobileNumber(), user.getPassword());
			arepo.save(registeruser);
			return "user is registered";
		}
		
	}

	@Override
	public String loginUser(LoginDto user) throws LoginException {
		oAuth loginUser =arepo.findByemail(user.getMobileNumber());
		
		if(loginUser==null) {
			throw new LoginException("user is already register with this mobile number");
		}
		else {
			if(loginUser.getPassword().equals(user.getPassword())){
				return "login succesfull";
			}
			else {
				return "please enter valid mobile number and password";
			}
		}
		
	}

	@Override
	public List<Driver> find_Rider(Integer user_id) throws FindingException {
		   Optional<User> us=urepo.findById(user_id);
		   if(!us.isPresent()) {
			   throw new FindingException("user not found by this id"); 
		   }
		   else {
			   Integer[] cood=us.get().getCurrentPosition();
			   Integer x1=cood[0];
			   Integer y1=cood[1];
			   List<Driver>getnearDriver= new ArrayList<>();
			   
			   List<Driver>allDriver=drepo.findAll();
			   
			   for(Driver div:allDriver) {
				   Integer[] driverCood=div.getCurrentPosition();
				   Integer x2=driverCood[0];
				   Integer y2= driverCood[1];
				   
				   Integer q1=x2-x1;
				   Integer q2=y2-y1;
				   
				   Integer p1=(int)Math.pow(q1, 2);
				   Integer p2= (int)Math.pow(q2, 2);
				   Integer distnace=(int) Math.sqrt(p1+p2);
				   
				   if(distnace<=5){
					   getnearDriver.add(div);
				   }
			   }
			   if(getnearDriver.size()>=1) {
				   return getnearDriver; 
			   }
			   else {
				   throw new FindingException("no rider available in your area"); 
			   }
			   
			  
		   }
		 
	}

	@Override
	public String book_Ride(Integer driverid,Integer x, Integer y) throws BookingException {
		  Driver bookDriver=drepo.getById(driverid);
		  if(bookDriver==null) {
			  throw new BookingException("no rider available with this driverid"); 
		  }
		  else {
			  Integer[]oldPosition=bookDriver.getCurrentPosition();
			  oldPosition[0]=x;
			  oldPosition[1]=y;
			  drepo.save(bookDriver);
			  return "booking is done and drive position is update to your currentPosition";
		  }
		
	}


}
