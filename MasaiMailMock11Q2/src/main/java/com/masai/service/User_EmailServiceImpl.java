package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.MailException;
import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.User;
import com.masai.repo.EmailRepo;
import com.masai.repo.UserRepo;

@Service
public class User_EmailServiceImpl implements User_EmailService{
	
	@Autowired
	private UserRepo urepo;
	
	@Autowired
	private EmailRepo erepo;

	@Override
	public List<User> retrieveAllUsers() throws UserException {
		List<User> users= urepo.findAll();
		
		if(users.size()==0)
			throw new UserException("There is No User Available over Here !");
		else
			return users;
	}

	@Override
	public User createUser(User user) throws UserException {
			User newUser= urepo.save(user);
			return newUser;
	}

	@Override
	public User retrieveUserById(Integer id) throws UserException {
		Optional<User> user= urepo.findById(id);
		
		if(!user.isPresent()) {
			throw new UserException("User does not exist!!!!");
		}
		else
			return user.get();
	}

	@Override
	public String DeleteUser(Integer id) throws UserException {
		Optional<User> user= urepo.findById(id);
		
		if(!user.isPresent()) {
			throw new UserException("User does not exist!!!!");
		}
		else
			urepo.delete(user.get());
			return "user removed Successfully !!!!!!!";
	}

	@Override
	public Email retrieveEmailforUser(Integer id, Integer mail_id) throws Exception {
		Optional<User> user= urepo.findById(id);
		if(user.isPresent()) {
			 Optional<Email> mail= erepo.findById(mail_id);
			 if(mail.isEmpty()) {
				 throw new MailException("No email found with this ID !");
			 }
			 else
				 return mail.get();
		}
		else
			throw new UserException("No user found with this ID");
	}

	@Override
	public Email CreateEmailForAUser(Integer id, Email mail) throws UserException {
		Optional<User> user= urepo.findById(id);
		
		if(!user.isPresent()) {
			throw new UserException("User does not exist!!!!");
		}
		else
			return  erepo.save(mail);
	}

}
