package com.training.OnlineFoodDeliveryApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.OnlineFoodDeliveryApp.model.Restaurant;
import com.training.OnlineFoodDeliveryApp.services.RestaurantService;

@RestController
public class AppController {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	@Autowired 
	RestaurantService service;
	
	
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
	    List<Restaurant> listRestaurants = service.listAll();
	    model.addAttribute("listRestaurants", listRestaurants);
	        return "Restaurant";
	}
	
	
}
