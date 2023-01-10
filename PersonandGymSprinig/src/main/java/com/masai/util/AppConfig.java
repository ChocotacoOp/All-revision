package com.masai.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.masai.model.Gym;
import com.masai.model.Person;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySources({
	
	@PropertySource("names.properties"),
})

public class AppConfig {

	
	
	@Bean
	public Map<Person,Gym> getMap()
	{
		Map<Person,Gym> themap = new HashMap<>();
		
		themap.put(new Person(1, "Sumedh", "sumemdh@gmail.com", 19, "9999999"), new Gym(1, "ram", 120));
		themap.put(new Person(2, "sachin", "sachinn@gmal.com", 20, "9999"), new Gym(2, "sita", 1120));
		themap.put(new Person(3, "dog", "dogA@gmail.com", 21, "9"), new Gym(3, "gita", 1320));

		
		
		
		return themap;
	}
	
	
	@Bean
	 public List<Person> getList()
	 {
		
		List<Person> theList = new ArrayList<>();
		
		 theList.add(new Person(1, "sumedh", "sumedh@gmail.com", 23, "9999999"));
		 theList.add(new Person(2, "sumedh1", "sumedh@gmail.com", 24, "999"));
		 theList.add(new Person(3, "sumedh2", "sumedh@gmail.com", 25, "99967"));
		 theList.add(new Person(4, "sumedh3", "sumedh@gmail.com", 26, "999000"));
		 theList.add(new Person(5, "sumedh4", "sumedh@gmail.com", 27, "0000"));
		
		return theList;
	 }
	
}
