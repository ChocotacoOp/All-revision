package com.masai.contoller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.BookingException;
import com.masai.Exception.FindingException;
import com.masai.Exception.LoginException;
import com.masai.Exception.UserException;
import com.masai.model.Driver;
import com.masai.model.LoginDto;
import com.masai.model.RegisterDto;
import com.masai.model.User;
import com.masai.repository.DriverRepo;
import com.masai.service.userService;


@RestController
@RequestMapping("/masaicab")
public class UserController {
	
	@Autowired
	private userService uservice;
	
	@PostMapping(value="/user/register",produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<String> registerUserHandler(@Valid @org.springframework.web.bind.annotation.RequestBody RegisterDto user)throws LoginException{
		System.out.print(user.toString());
		
		String result= uservice.registerUser(user);
		
		return new ResponseEntity<String>(result,HttpStatus.CREATED);
	}
	
	
	@PostMapping(value="/user/login" ,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<String> loginUserHandler(@org.springframework.web.bind.annotation.RequestBody LoginDto user)throws LoginException{
		
		String result= uservice.loginUser(user);
		
		return new ResponseEntity<String>(result,HttpStatus.OK);
	}
	
	@GetMapping(value="/user/findrider/{id}")
	public ResponseEntity<List<Driver>>findtheRiderHandler(@PathVariable("id") Integer id)throws FindingException{
		List<Driver>alldriver=uservice.find_Rider(id);
		return new ResponseEntity<List<Driver>>(alldriver,HttpStatus.OK);
	}
	
	@GetMapping(value="/user/book/{driverId}/{x}/{y}")
	public ResponseEntity<String>bookingRideHandler(@PathVariable("driverId") Integer dirverid,@PathVariable("x") Integer x,@PathVariable("y") Integer y)throws BookingException{
		String result=uservice.book_Ride(dirverid, x, y);
		return new ResponseEntity<String>(result,HttpStatus.OK);
	}
	
	
}
