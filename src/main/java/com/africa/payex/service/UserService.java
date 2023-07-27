package com.africa.payex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.africa.payex.data.model.User;
import com.africa.payex.data.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	// CREATE
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	// READ
	public List<User> getUser() {
		return userRepository.findAll();
	}
	// DELETE
	public void deleteUser(long userID) {
		userRepository.deleteById(userID);
	}
	//  UPDATE
	public User updateUser(Long userId, User user) {
		User user1 = userRepository.findById(userId).get();
		user1.setFirstName(user.getFirstName());
		user1.setLastName(user.getLastName());
		user1.setEmailId(user.getEmailId());
		return userRepository.save(user1);
	}
}
