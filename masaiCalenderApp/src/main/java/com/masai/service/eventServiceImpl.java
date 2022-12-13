package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.eventException;
import com.masai.model.Event;
import com.masai.model.user;
import com.masai.repo.EventRepo;
import com.masai.repo.UserRepo;


@Service
public class eventServiceImpl implements eventService{
	
	
	@Autowired
	private EventRepo edao;
	
	@Autowired
	private UserRepo udao;

	@Override
	public String addEvent(Event event) throws eventException {
		user aduser=event.getUsers();
		if(aduser==null) {
			throw new eventException("put the user detail in which you going to add event");
		}
		udao.save(aduser);
		edao.save(event);
		
		return "event is added to the user";
	}

	@Override
	public String deleteEvent(Integer id) throws eventException {
		 
		
		Optional<Event>existevent=edao.findById(id);
		if(existevent.isPresent()) {
			Event delevent= existevent.get();
			edao.delete(delevent);
			return "event is deleted";
		}
		else{
			throw new eventException("put the valid event id");
		}
	}

	@Override
	public String updateEvent(Integer id, Event event) throws eventException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
