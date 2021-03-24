package com.nico.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nico.ecommerce.model.Category;
import com.nico.ecommerce.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> getAllCategory() {
		List<Category> category = new ArrayList<Category>();
		categoryRepository.findAll().forEach(cat1 -> category.add(cat1));
		return category;
	}
	
	public Category getCategoryById(long id) {
		return categoryRepository.findById(id).get();
	}
	
	public void saveOrUpdate(Category category) {
		categoryRepository.save(category);
	}
	
	public void delete(long id) {
		categoryRepository.deleteById(id);
	}
	
	public void update(Category category) {
		categoryRepository.save(category);
	}
}
