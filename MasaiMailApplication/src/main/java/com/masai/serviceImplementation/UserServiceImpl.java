package com.masai.serviceImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Repo.LogInRepo;
import com.masai.Repo.UserRepo;
import com.masai.exception.MailException;
import com.masai.exception.UserException;
import com.masai.model.LogInRegister;
import com.masai.model.Mail;
import com.masai.model.User;
import com.masai.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo ur;
	
	@Autowired
	private LogInRepo lr;
	

	@Override
	public User register(User user) throws UserException {

		User u1=ur.findUserByEmail(user.getMailId());
		if(u1==null) {
			
			User u2=ur.save(user);
			return u2;
			
		}else {
			throw new UserException("A user is already present with this mail id");
		}
		
		
	}

	@Override
	public String Login(User user) throws UserException {
		
		List<LogInRegister> lin= lr.findAll();
		if(lin.size()>0) {
			throw new UserException("A user is already Logged In");
		}else {
			
//			boolean flag=true;
			List<User> userList= ur.findAll();
			
			for(User u:userList) {
				if(u.getMailId().equals(user.getMailId()) && u.getPassword().equals(user.getPassword())){
					LogInRegister lin2= new LogInRegister();
					lin2.setUserId(user.getId());
					lin2.setPresent(true);
					lr.save(lin2);
					return "Login Successful";
				}
			}
			
			throw new UserException("No user found for supplied MailId and Passwprd");
			
		}
		
	}

	@Override
	public List<Mail> allMails() throws MailException,UserException {
		
		List<LogInRegister> lin=lr.findAll();
		if(lin.size()>0) {
			for(LogInRegister l:lin) {
				
				Optional<User> u1=ur.findById(l.getUserId());
				 
				List<Mail> mailList= u1.get().getInbox();
				if(mailList.size()>0) {
					return mailList;
				}	
			}
			throw new MailException("Inbox Empty");	
		}else {
			throw new UserException("You need to login First");
		}
	}

	@Override
	public List<Mail> allStaredMails() throws MailException,UserException{

		List<LogInRegister> lin=lr.findAll();
		if(lin.size()>0) {
			for(LogInRegister l:lin) {
				
				Optional<User> u1=ur.findById(l.getUserId());
				 
				List<Mail> mailList= u1.get().getInbox();
				List<Mail> starMail=new ArrayList<>();
				
				if(mailList.size()>0) {
					
					for(Mail m:mailList) {
						if(m.getStarred()!=null) {
							starMail.add(m);
						}
					}
					
				}
				if(starMail.size()>0) {
					return starMail;
				}else {
					throw new MailException("No Starred message found");	
				}
			}
			throw new MailException("Inbox Empty");	
		}else {
			throw new UserException("You need to login First");
		}
		
	}

	@Override
	public User updateUser(User user) throws UserException {
		
		User u1=ur.findUserByEmail(user.getMailId());
		if(u1!=null){
			
			if(u1.getPassword().equals(user.getPassword())) {
				User u2=ur.save(user);
				return u2;
			}else {
				throw new UserException("Please Check you username and password");
			}		
		}else {
			throw new UserException("No user present with this mail id for updation");
		}
		
	}
	
	

}
