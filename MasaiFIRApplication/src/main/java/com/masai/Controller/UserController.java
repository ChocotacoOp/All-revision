package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.masai.exception.FIRException;
import com.masai.exception.UserException;
import com.masai.model.FIR;
import com.masai.model.User;
import com.masai.serviceImpl.UserServiceImpl;

@RestController
@RequestMapping("/masaifir/user")
public class UserController {

	@Autowired
	private UserServiceImpl ui;
	
	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User user) throws  UserException{
		User u1= ui.registerUser(user);
		return new ResponseEntity<>(u1,HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody User user) throws  UserException{
		String u1= ui.UserLogin(user);
		return new ResponseEntity<>(u1,HttpStatus.OK);
	}
	@GetMapping("/fir")
	public ResponseEntity<List<FIR>> allFIR() throws FIRException, UserException{
		List<FIR> af= ui.all_FIR();
		return new ResponseEntity<>(af,HttpStatus.OK);
	}
	@PutMapping("/fir/{firId}")
	public ResponseEntity<String> deleteFir(@PathVariable Integer firId ) throws FIRException, UserException{
		String str=ui.DeleteA_FIR(firId);
		return new ResponseEntity<>(str,HttpStatus.OK);
	}

	
	
	
}
