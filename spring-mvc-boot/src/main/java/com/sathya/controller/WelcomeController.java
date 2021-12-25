package com.sathya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/hello")
	public  ModelAndView  getWelcomePage() {
		return  new  ModelAndView("welcome");
	}

}
