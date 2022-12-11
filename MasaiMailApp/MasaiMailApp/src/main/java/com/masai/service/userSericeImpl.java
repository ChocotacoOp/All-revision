package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Dao.emailDao;
import com.masai.Dao.oAuthDao;
import com.masai.Dao.userDao;
import com.masai.globalException.emailException;
import com.masai.globalException.loginException;
import com.masai.globalException.userException;
import com.masai.model.email;
import com.masai.model.loginDto;
import com.masai.model.oAuth;
import com.masai.model.registerDto;
import com.masai.model.user;

@Service
public class userSericeImpl implements userService {
	
	@Autowired
	private userDao udao;
	
	@Autowired
	private oAuthDao odao;
	
	@Autowired
	private emailDao edao;
	

	@Override
	public String registerUser(registerDto user) throws loginException {
		oAuth ex =odao.findByemail(user.getEmail());
		
		if(ex!=null) {
			throw new loginException("user is alreay register with this email id");
		}
		else {
			user newuser= new user(user.getEmail(), user.getFirstName(), user.getLastName(), user.getMobileNumber(), user.getDateofbirth());
			udao.save(newuser);
			oAuth registeruser= new oAuth(user.getEmail(), user.getPassword());
			odao.save(registeruser);
			return "user is registered";
		}
		
	}

	@Override
	public String loginUser(loginDto user) throws loginException {
		
		
		return null;
	}

	@Override
	public List<email> getAllMail() throws emailException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<email> getAllStarredMail() throws emailException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUser(user userDetails) throws userException {
		// TODO Auto-generated method stub
		return null;
	}

}
