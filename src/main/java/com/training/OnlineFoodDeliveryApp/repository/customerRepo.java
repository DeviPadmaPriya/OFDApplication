package com.training.OnlineFoodDeliveryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.OnlineFoodDeliveryApp.model.Customer;

public interface customerRepo extends JpaRepository<Customer,Integer>{

}