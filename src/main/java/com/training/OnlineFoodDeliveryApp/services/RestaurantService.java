package com.training.OnlineFoodDeliveryApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.OnlineFoodDeliveryApp.model.Restaurant;
import com.training.OnlineFoodDeliveryApp.repository.RestaurantRepository;

@Service
public class RestaurantService {
	
	@Autowired
	RestaurantRepository restaurant;

	public List<Restaurant> listAll() {
	
		return restaurant.findAll();
	}
	

	
}
