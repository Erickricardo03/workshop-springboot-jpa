package com.utility.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utility.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
