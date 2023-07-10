package com.ecom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.enities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
