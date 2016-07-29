package com.openjack.sugarCrmIntegration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.openjack.sugarCrmIntegration.dao.UserDao;
import com.openjack.sugarCrmIntegration.model.User;

/**
 * @author pjohn
 *
 */
@Component
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public User findUserByEmail(String email) {
		return userDao.findByEmail(email);
	}
	
	public Iterable<User> getAllUsers(){
		return userDao.findAll();
	}

	public void createUser(User user) {
		userDao.save(user);
	}
}
