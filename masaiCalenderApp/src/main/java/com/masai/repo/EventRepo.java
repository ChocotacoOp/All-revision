package com.masai.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.model.Event;

public interface EventRepo extends JpaRepository<Event, Integer>{

	@Query("select e from Event e where e.type=?1")
	public List<Event> getthelistofEvent(String mesg);
}
