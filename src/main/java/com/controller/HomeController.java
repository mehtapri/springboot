package com.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HomeController {

	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String home() {
		
		
		return "home"; 
		
	}
	
	
	@PostMapping(value = "/index")
	public String index() {
		
		
		return "java";
	}
}
