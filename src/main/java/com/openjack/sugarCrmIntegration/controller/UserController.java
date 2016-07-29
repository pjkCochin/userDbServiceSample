package com.openjack.sugarCrmIntegration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.openjack.sugarCrmIntegration.model.User;
import com.openjack.sugarCrmIntegration.service.UserService;

/**
 * @author pjohn
 *
 */

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	@ResponseBody
	public User getUser(){
		Iterable<User> usersList  = userService.getAllUsers();
		User user = usersList.iterator().next();
		return user;
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String createUser(@RequestBody User user) {
		userService.createUser(user);
		return "userCreated";
	}
}
