package com.utility.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utility.demo.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long> {

	
	
}
 