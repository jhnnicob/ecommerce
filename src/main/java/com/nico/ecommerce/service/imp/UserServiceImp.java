package com.nico.ecommerce.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nico.ecommerce.model.User;
import com.nico.ecommerce.repository.UserRepository;
import com.nico.ecommerce.service.UserService;

@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> listAll() {
		List<User> users = new ArrayList<User>();
		userRepository.findAll().forEach(user -> users.add(user));
		return users;
	}

	@Override
	public User saveOrUpdate(User user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public User getById(Long id) {
		return userRepository.findById(id).get();
	}

}
