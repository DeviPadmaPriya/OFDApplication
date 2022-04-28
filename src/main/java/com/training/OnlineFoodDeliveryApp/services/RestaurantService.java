package com.training.OnlineFoodDeliveryApp.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.OnlineFoodDeliveryApp.model.Restaurant;
import com.training.OnlineFoodDeliveryApp.repository.RestaurantRepository;

@Service
public class RestaurantService {
	
	@Autowired
 RestaurantRepository restaurantrepository;

	public List<Restaurant> listAll() {
	
		return restaurantrepository.findAll();
}
	 public void save(Restaurant restaurant) {
	        restaurantrepository.save(restaurant);
	    }

	/*public List<Restaurant> getRestaurants(){
	
		List<Restaurant> restaurants = (List<Restaurant>)restaurantrepository.findAll();
		return restaurants;
	}	*/
	
}
