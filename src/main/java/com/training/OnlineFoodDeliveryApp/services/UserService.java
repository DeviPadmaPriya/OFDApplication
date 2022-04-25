package com.training.OnlineFoodDeliveryApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.OnlineFoodDeliveryApp.model.User;
import com.training.OnlineFoodDeliveryApp.repository.UserRepositorty;



@Service
public class UserService {
	
	@Autowired
	
	private UserRepositorty repo;
	 public User login(String username,String password) {
		 User user = repo.findByUsernameAndPassword(username,password);
		 return user;
	 }

}
