package com.masai.service;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.masai.model.Gym;
import com.masai.model.Person;
import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

@Component
public class PersonService {

	@Autowired
	private Map<Person, Gym> themap;
	
	
	@Autowired
	private List<Person> theList;
	
	@Value("${appName}")
	private String appName;
	
	
	public void PrintList()
	{
		Collections.sort(theList, (a,b) -> (a.getAge()>=b.getAge())?1:1);
		
		theList.forEach(e->System.out.println(e));
	}
	
	
	
	public void PrintMap()
	{
		for(Map.Entry<Person, Gym> entity: themap.entrySet())
		{
			
			System.out.println(entity.getKey());
			System.out.println(entity.getValue());
			System.out.println("==============================================");
		}
		
	}
	
	
	public void printAppName()
	{
		System.out.println(appName);
	}
	
	
}
