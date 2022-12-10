package com.masai.service;

import com.masai.exception.MailException;
import com.masai.exception.UserException;
import com.masai.model.Mail;

public interface MailService {

	public Mail sendMail (Mail mail)throws MailException,UserException;
	public String StarMail(Integer mailId)throws MailException,UserException;
	public String deleteMail(Integer mailId)throws MailException,UserException;
}

