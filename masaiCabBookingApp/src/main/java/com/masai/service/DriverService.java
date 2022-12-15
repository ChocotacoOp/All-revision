package com.masai.service;

import com.masai.Exception.DriverException;
import com.masai.model.Driver;

public interface DriverService {
	
	public Driver registerDriver(Driver driver)throws DriverException;
	

}
