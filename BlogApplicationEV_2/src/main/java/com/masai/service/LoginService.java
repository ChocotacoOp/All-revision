package com.masai.service;

import com.masai.exception.LoginException;
import com.masai.model.LoginDTO;

public interface LoginService {

	public String logIntoAccount(LoginDTO dto)throws LoginException;
	public String logoutFromAccount(String key) throws LoginException;
}
