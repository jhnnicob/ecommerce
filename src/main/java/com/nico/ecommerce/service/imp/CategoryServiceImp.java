package com.nico.ecommerce.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nico.ecommerce.model.Category;
import com.nico.ecommerce.repository.CategoryRepository;
import com.nico.ecommerce.service.CategoryService;

@Service
public class CategoryServiceImp implements CategoryService{

	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public List<Category> listAll() {
		List<Category> categories = new ArrayList<Category>();
		categoryRepository.findAll().forEach(category -> categories.add(category));
		return categories;
	}
	
	@Override
	public Category saveOrUpdate(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Category getById(Long id) {
		return categoryRepository.findById(id).get();
	}


	@Override
	public void delete(Long id) {
		categoryRepository.deleteById(id);
	}

}
