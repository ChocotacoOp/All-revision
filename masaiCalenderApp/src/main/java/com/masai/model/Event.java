package com.masai.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eventid;
	private String title;
	private String type;
	private String description;
	private LocalDateTime start; 
	private LocalDateTime finish;
	
	
	@ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
	@JoinColumn(name="user_event")
	private user users;


	public Integer getEventid() {
		return eventid;
	}


	public void setEventid(Integer eventid) {
		this.eventid = eventid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDateTime getStart() {
		return start;
	}


	public void setStart(LocalDateTime start) {
		this.start = start;
	}


	public LocalDateTime getFinish() {
		return finish;
	}


	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}


	public user getUsers() {
		return users;
	}


	public void setUsers(user users) {
		this.users = users;
	}


	public Event(Integer eventid, String title, String type, String description, LocalDateTime start,
			LocalDateTime finish, user users) {
		super();
		this.eventid = eventid;
		this.title = title;
		this.type = type;
		this.description = description;
		this.start = start;
		this.finish = finish;
		this.users = users;
	}


	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Event [eventid=" + eventid + ", title=" + title + ", type=" + type + ", description=" + description
				+ ", start=" + start + ", finish=" + finish + "]";
	}



}
