package com.utility.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utility.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
