package com.training.OnlineFoodDeliveryApp.controller;

import java.util.List;

//import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.training.OnlineFoodDeliveryApp.model.Restaurant;
import com.training.OnlineFoodDeliveryApp.services.RestaurantService;





@RestController
public class HomeController {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	@Autowired 
	RestaurantService restaurantservice;

	/*@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ModelAndView getRestaurants() {
		ModelAndView mav = new ModelAndView("listRestaurants");
		List<Restaurant> restaurants = restaurantservice.getRestaurants();
		mav.addObject("allRestaurants",restaurants);
		return mav;
		
	}*/

	public String viewHomePage(Model model) {
	    List<Restaurant> listRestaurants = restaurantservice.listAll();
	    model.addAttribute("listRestaurants", listRestaurants);
	   return "index";
	}
	
	@RequestMapping("/new")
	public String showNewRestaurantPage(Model model) {
	    Restaurant restaurant = new Restaurant();
	    model.addAttribute("restaurant", restaurant);
	    return "NewRestaurant.jsp";
	}	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveRestaurant(@ModelAttribute("restaurant") Restaurant restaurant) {
	    restaurantservice.save(restaurant);
	     
	    return "redirect:/";
	}	
	
	}
	

