package com.nico.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nico.ecommerce.model.User;
import com.nico.ecommerce.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUser() {
		List<User> user = new ArrayList<User>();
		userRepository.findAll().forEach(user1 -> user.add(user1));
		return user;
	}
	
	public User getUserById(long id) {
		return userRepository.findById(id).get();
	}
	
	public void saveOrUpdate(User user) {
		userRepository.save(user);
	}
	
	public void delete(long id) {
		userRepository.deleteById(id);
	}
	
	public void update(User user, long id) {
		userRepository.save(user);
	}
}
