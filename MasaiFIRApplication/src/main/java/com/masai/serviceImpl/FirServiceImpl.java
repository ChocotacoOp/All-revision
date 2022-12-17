package com.masai.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.Repo.FIRRepo;
import com.masai.Repo.LogRepo;
import com.masai.Repo.UserRepo;
import com.masai.exception.FIRException;
import com.masai.exception.UserException;
import com.masai.model.FIR;
import com.masai.model.LogInOut;
import com.masai.model.User;
import com.masai.service.FIRService;


@Service
public class FirServiceImpl implements FIRService {

	
	@Autowired
	private UserRepo ur;
	
	@Autowired
	private LogRepo lr;
	
	@Autowired
	private FIRRepo fr;

	@Override
	public FIR fileA_FIR(FIR fir) throws FIRException,UserException{
		
		List<LogInOut> lin=lr.findAll();
		if(lin.size()>0) {
			for(LogInOut l:lin) {
				
				Optional<User> u1=ur.findById(l.getId());
  
			    List<User> lf= fir.getFirMadeOn();
			    
			    boolean flag=true;
			    
			    for(User u:lf) {
			    	Optional<User> u2=ur.findById(u.getId());
			    	if(u2.isEmpty()) {
			    		flag=false;
                       break;			    		
			    	}
			    }
			    
			    if(flag) {
			    	
			      FIR fir2=fr.save(fir);
			      List<FIR> fl2 =u1.get().getFirFilled();
			      fl2.add(fir2);
			      u1.get().setFirFilled(fl2);
			      ur.save(u1.get());
			      
			      return fir2;
			      
			      
			    	
			    }else {
			    	throw new UserException("The user not found which you want to FIR !!!");
			    }
				
			}
			throw new UserException("Some error Occoured");	
		}else {
			throw new UserException("You need to login First !!");
		}
		

	}
	
	
	
}
