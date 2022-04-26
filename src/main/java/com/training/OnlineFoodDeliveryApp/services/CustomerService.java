package com.training.OnlineFoodDeliveryApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.OnlineFoodDeliveryApp.repository.CustomerRepository;


@Service
public class CustomerService {

	@Autowired
	CustomerRepository repository;

}
