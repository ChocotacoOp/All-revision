package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.FIRException;
import com.masai.exception.UserException;
import com.masai.model.FIR;
import com.masai.serviceImpl.FirServiceImpl;

@RestController
@RequestMapping("/masaifir")
public class FIRController {

	@Autowired
	private FirServiceImpl fi;
	
	@PostMapping("/user/fir")
	public ResponseEntity<FIR> registerUser(@RequestBody FIR fir) throws FIRException, UserException{
		FIR f= fi.fileA_FIR(fir);
		return new ResponseEntity<>(f,HttpStatus.CREATED);
	}
	

	
}
