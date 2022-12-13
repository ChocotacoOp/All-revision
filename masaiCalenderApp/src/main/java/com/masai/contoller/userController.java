package com.masai.contoller;

import java.util.List;

import javax.print.attribute.standard.Media;
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

import com.masai.Exception.eventException;
import com.masai.Exception.loginException;
import com.masai.Exception.userException;
import com.masai.model.Event;
import com.masai.model.loginDto;
import com.masai.model.registerDto;
import com.masai.model.user;
import com.masai.service.userService;


@RestController
@RequestMapping("/masaicalender")
public class userController {
	
	@Autowired
	private userService uservice;
	
	@PostMapping(value="/register",produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<String> registerUserHandler(@Valid @org.springframework.web.bind.annotation.RequestBody registerDto user)throws loginException{
		System.out.println("aish");
		System.out.print(user.toString());
		
		String result= uservice.registerUser(user);
		
		return new ResponseEntity<String>(result,HttpStatus.CREATED);
	}
	
	@PostMapping(value="/login" ,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<String> loginUserHandler(@org.springframework.web.bind.annotation.RequestBody loginDto user)throws loginException{
		System.out.println(user);
		
		String result= uservice.loginUser(user);
		
		return new ResponseEntity<String>(result,HttpStatus.OK);
	}
	
	@PutMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<String> updateUserHandler(@Valid @org.springframework.web.bind.annotation.RequestBody user us)throws userException{
		String result=uservice.updateUser(us);
		
		return new ResponseEntity<String>(result,HttpStatus.OK);
	}
	
	@GetMapping(value = "/event/{type}")
	public ResponseEntity<List<Event>>getlistOfEvent(@PathVariable("type") String mesg)throws eventException, userException{
		List<Event>allevent=uservice.getEventBytype(mesg);
		return new ResponseEntity<List<Event>>(allevent,HttpStatus.OK);
	}
	
	

}
