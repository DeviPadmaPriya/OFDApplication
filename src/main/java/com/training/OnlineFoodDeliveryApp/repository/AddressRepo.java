package com.training.OnlineFoodDeliveryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.OnlineFoodDeliveryApp.model.Address;

public interface AddressRepo extends JpaRepository<Address,Integer>{

}
