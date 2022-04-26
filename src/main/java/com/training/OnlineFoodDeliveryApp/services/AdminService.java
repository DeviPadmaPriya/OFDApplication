package com.training.OnlineFoodDeliveryApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.OnlineFoodDeliveryApp.repository.AdminRepository;



@Service
public class AdminService {
	
	@Autowired
	AdminRepository repository;
	

}
