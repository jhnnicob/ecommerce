package com.nico.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nico.ecommerce.model.User;
import com.nico.ecommerce.service.CrudService;
import com.nico.ecommerce.service.UserService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	CrudService<User> crudService;
	
	@GetMapping("/user")
	public List<User> getAll() {
		return crudService.listAll();
	}
	
	@PostMapping("/user")
	public String save(@RequestBody User user) {
		crudService.saveOrUpdate(user);
		return "Record saved!";
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") long id) {
		return crudService.getById(id);
	}
	
	@PutMapping("/user")
	public void update(@RequestBody User user) {
		crudService.saveOrUpdate(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void delete(@PathVariable("id") long id) {
		crudService.delete(id);
	}
}
