package com.training.project.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.project.customer.model.Customer;

public interface customerRepo extends JpaRepository<Customer,Integer>{

}
