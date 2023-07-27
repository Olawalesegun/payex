package com.africa.payex.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.africa.payex.data.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
