package com.training.OnlineFoodDeliveryApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.OnlineFoodDeliveryApp.model.User;
@Repository

public interface UserRepositorty  extends JpaRepository<User,Integer> {
	User findByUsernameAndPassword(String username,String password);
	
	

}
