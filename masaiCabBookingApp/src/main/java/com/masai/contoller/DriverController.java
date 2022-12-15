package com.masai.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.DriverException;
import com.masai.model.Driver;
import com.masai.service.DriverService;

@RestController
@RequestMapping("/masaicab")
public class DriverController {
	
	@Autowired
	private DriverService dservice;
	
	@PostMapping(value="/driver/register",produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Driver>  registerDriverHandler(@RequestBody Driver driver)throws DriverException{
		Driver reDriver=dservice.registerDriver(driver);
		return new ResponseEntity<Driver>(reDriver,HttpStatus.CREATED);
	}

}
