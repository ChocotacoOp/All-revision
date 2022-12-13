package com.masai.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.eventException;
import com.masai.model.Event;
import com.masai.service.eventService;


@RestController
@RequestMapping("/masaicalender")
public class eventController {
	
	@Autowired
	private eventService eservice;
	
	@PostMapping(value = "/event", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<String> addEventHandler(@RequestBody Event event)throws eventException{
		String result=eservice.addEvent(event);
		return new ResponseEntity<String>(result,HttpStatus.CREATED);
	}
	
	@DeleteMapping(value="/event/{id}")
	public ResponseEntity<String> deleteEventHandler(Integer id)throws eventException{
		String result=eservice.deleteEvent(id);
		return new ResponseEntity<String>(result,HttpStatus.OK);
	}
	

}
