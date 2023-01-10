package com.masai.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.service.PersonService;
import com.masai.util.AppConfig;

public class Demo {

	
	
  public static void main(String[] args) {
	
	
	  ApplicationContext atx = new AnnotationConfigApplicationContext(AppConfig.class);
	  
	  PersonService pservice  = atx.getBean("personService", PersonService.class);
	  
	  System.out.println("\nApp Name");
	  pservice.printAppName();
	  System.out.println("PrintList");
	  pservice.PrintList();
	  
	 System.out.println("Print Map");
	 pservice.PrintMap();
	  
}	
	
	
	
}
