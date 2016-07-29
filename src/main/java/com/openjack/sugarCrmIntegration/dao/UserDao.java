package com.openjack.sugarCrmIntegration.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.openjack.sugarCrmIntegration.model.User;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {
	
	public User findByEmail(String email);
}
