package com.nico.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nico.ecommerce.model.Category;
import com.nico.ecommerce.service.CategoryService;

@RestController
@RequestMapping("/api")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/category")
	private List<Category> getAllCategory() {
		return categoryService.listAll();
	}
	
	@GetMapping("/category/{id}")
	private Category getCategory(@PathVariable("id") long id) {
		return categoryService.getById(id);
	}
	
	@DeleteMapping("/category/{id}")
	private void deleteCategory(@PathVariable("id") long id) {
		categoryService.delete(id);
	}
	
	@PostMapping("/category")
	private long saveCategory(@RequestBody Category category) {
		categoryService.saveOrUpdate(category);
		return category.getId();
	}
	
	@PutMapping("/category")
	private Category update(@RequestBody Category category) {
		categoryService.saveOrUpdate(category);
		return category;
	}
	
}
