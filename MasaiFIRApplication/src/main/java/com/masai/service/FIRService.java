package com.masai.service;

import com.masai.exception.FIRException;
import com.masai.exception.UserException;
import com.masai.model.FIR;

public interface FIRService {

	public FIR  fileA_FIR (FIR driver)throws FIRException,UserException;

}

