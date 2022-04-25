package com.training.project.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.project.customer.model.Address;

public interface AddressRepo extends JpaRepository<Address,Integer>{

}
