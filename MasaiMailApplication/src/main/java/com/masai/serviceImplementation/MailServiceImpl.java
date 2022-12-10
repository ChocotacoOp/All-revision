package com.masai.serviceImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Repo.LogInRepo;
import com.masai.Repo.MailRepo;
import com.masai.Repo.UserRepo;
import com.masai.exception.MailException;
import com.masai.exception.UserException;
import com.masai.model.LogInRegister;
import com.masai.model.Mail;
import com.masai.model.User;
import com.masai.service.MailService;


@Service
public class MailServiceImpl implements MailService {

	@Autowired
	private UserRepo ur;
	
	@Autowired
	private LogInRepo lr;
	
	@Autowired
	private MailRepo mr;
	
	
	@Override
	public Mail sendMail(Mail mail) throws MailException, UserException {
		// TODO Auto-generated method stub
		
		List<LogInRegister> lin=lr.findAll();
		if(lin.size()>0) {
			for(LogInRegister l:lin) {
				
				Optional<User> u1=ur.findById(l.getUserId());	
				Optional<User> u2=ur.findById(mail.getSentTo().getId());
				
				if(u2!=null) {
				
				Mail smail=	mr.save(mail);
					
					List<Mail> m1=new ArrayList<>();
					for(Mail m:u1.get().getSent()) {
						m1.add(m);
					}
					m1.add(smail);
					u1.get().setSent(m1);
					
					ur.save(u1.get());
					
					List<Mail> m2=new ArrayList<>();
					for(Mail m:u2.get().getInbox()) {
						m2.add(m);
					}
					m2.add(smail);
					
					u2.get().setSent(m1);
					ur.save(u2.get());
					
					return smail;
					
				}else {
					throw new UserException("the user you want to send mail is not present");
				} 
			}
			throw new MailException("error");
		}else {
			throw new UserException("You need to login First");
		}
	}

	@Override
	public String StarMail(Integer mailId) throws MailException, UserException {
		// TODO Auto-generated method 

		List<LogInRegister> lin=lr.findAll();
		if(lin.size()>0) {
			for(LogInRegister l:lin) {
				
				Optional<User> u1=ur.findById(l.getUserId());
				 
				List<Mail> mailList= u1.get().getInbox();
				if(mailList.size()>0) {
					
					for(Mail m:mailList) {
						
						if(m.getMailId()==mailId){
							m.setStarred("true");
							u1.get().setInbox(mailList);
							return "mail Stared successfully";
							
					}					
					}
					
						throw new MailException("No mail found by Id :"+ mailId);
				}	
			}
			throw new MailException("Inbox Empty");	
		}else {
			throw new UserException("You need to login First");
		}
		
		
	

	}

	@Override
	public String deleteMail(Integer mailId) throws MailException, UserException {
		// TODO Auto-generated method stub
		
		List<LogInRegister> lin=lr.findAll();
		if(lin.size()>0) {
			for(LogInRegister l:lin) {
				
				Optional<User> u1=ur.findById(l.getUserId());
				 
				List<Mail> mailList= u1.get().getInbox();
				if(mailList.size()>0) {
					
					for(Mail m:mailList) {
						
						if(m.getMailId()==mailId){
							Optional<Mail> m3= mr.findById(mailId);
							mr.deleteById(mailId);
							mailList.remove(m3);
							u1.get().setInbox(mailList);
							return "mail Deleted successfully";
					}					
					}
					
						throw new MailException("No mail found by Id :"+ mailId);
				}	
			}
			throw new MailException("Inbox Empty");	
		}else {
			throw new UserException("You need to login First");
		}
		
	}

}
