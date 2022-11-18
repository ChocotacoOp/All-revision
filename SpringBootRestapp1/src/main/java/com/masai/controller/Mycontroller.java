package com.masai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {
	
	
	@RequestMapping("/welcome")
	public String mycontrollerService() {
		return ("welcome to sb ");
	}
}
