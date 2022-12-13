package com.masai.service;

import com.masai.Exception.eventException;
import com.masai.model.Event;

public interface eventService {
	
	public String addEvent(Event event)throws eventException;
	public String deleteEvent(Integer id)throws eventException;
	public String updateEvent(Integer id , Event event)throws eventException;

}
