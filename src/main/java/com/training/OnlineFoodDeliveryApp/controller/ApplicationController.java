package com.training.OnlineFoodDeliveryApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ApplicationController {
	
	@GetMapping("/")
	public ModelAndView homePage() {
		return new ModelAndView("home");
	}
	
	@GetMapping("/login")
	public ModelAndView loginPage() {
		return new ModelAndView("login");
	}
	@GetMapping("/register")
	public ModelAndView registerPage() {
		return new ModelAndView("register");
	}
	

}
