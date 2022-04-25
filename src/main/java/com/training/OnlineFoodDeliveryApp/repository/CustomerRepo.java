package com.training.OnlineFoodDeliveryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.OnlineFoodDeliveryApp.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer>{

}
