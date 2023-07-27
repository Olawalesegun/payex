package com.africa.payex.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.africa.payex.data.model.User;
import com.africa.payex.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public User createEmployee(@RequestBody User user) {
		return userService.createUser(user);
	}
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public List<User> readUser(){
		return userService.getUser();
	}
	@RequestMapping(value="/user/{userID}", method=RequestMethod.PUT)
	public User updateUser(@PathVariable(value="userID") Long id, @RequestBody User user) {
		return userService.updateUser(id, user);
	}
	@RequestMapping(value="/user/{userID}", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable(value="userID") Long id, @RequestBody User user) {
		userService.deleteUser(id);
	}
}
