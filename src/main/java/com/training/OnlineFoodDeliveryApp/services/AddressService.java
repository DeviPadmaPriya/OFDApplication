package com.training.OnlineFoodDeliveryApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.OnlineFoodDeliveryApp.repository.AddressRepo;
@Service
public class AddressService {
	
	@Autowired
	AddressRepo address;

}
