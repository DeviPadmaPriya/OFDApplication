package com.training.OnlineFoodDeliveryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.OnlineFoodDeliveryApp.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant,Integer> {

}
