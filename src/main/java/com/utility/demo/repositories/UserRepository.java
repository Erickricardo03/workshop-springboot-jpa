package com.utility.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utility.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
 