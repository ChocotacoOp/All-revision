package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.DriverException;
import com.masai.model.Driver;
import com.masai.repository.DriverRepo;


@Service
public class DriverServiceImpl implements DriverService {
	
	@Autowired
	private DriverRepo drepo;

	@Override
	public Driver registerDriver(Driver driver) throws DriverException {
		return drepo.save(driver);
	}

}
