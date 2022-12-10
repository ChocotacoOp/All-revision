package com.masai.service;

import java.util.List;

import com.masai.exception.MailException;
import com.masai.exception.UserException;
import com.masai.model.Mail;
import com.masai.model.User;

public interface UserService {

	public User register(User user)throws UserException;
	public String Login(User user)throws UserException;
	public List<Mail> allMails()throws MailException,UserException;
	public List<Mail> allStaredMails()throws MailException,UserException;
	public User updateUser(User user)throws UserException;
}

