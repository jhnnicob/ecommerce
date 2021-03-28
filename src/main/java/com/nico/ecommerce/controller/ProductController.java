package com.nico.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nico.ecommerce.model.Product;
import com.nico.ecommerce.service.CrudService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	CrudService<Product> crudService;
	
	@GetMapping("/product")
	public List<Product> getAll() {
		return crudService.listAll();
	}
	
	@PostMapping("/product")
	public String save(@RequestBody Product product) {
		crudService.saveOrUpdate(product);
		return "Record saved!";
	}
	
	@GetMapping("/product/{id}")
	public Product getUser(@PathVariable("id") long id) {
		return crudService.getById(id);
	}
	
	@PutMapping("/product")
	public void update(@RequestBody Product product) {
		crudService.saveOrUpdate(product);
	}
	
	@DeleteMapping("/product/{id}")
	public void delete(@PathVariable("id") long id) {
		crudService.delete(id);
	}
}
