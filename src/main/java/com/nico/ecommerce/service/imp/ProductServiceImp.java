package com.nico.ecommerce.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nico.ecommerce.model.Product;
import com.nico.ecommerce.model.User;
import com.nico.ecommerce.repository.ProductRepository;
import com.nico.ecommerce.service.CrudService;

@Service
public class ProductServiceImp implements CrudService<Product>{
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> listAll() {
		List<Product> users = new ArrayList<Product>();
		productRepository.findAll().forEach(user -> users.add(user));
		return users;
	}

	@Override
	public void delete(Long id) {
		productRepository.deleteById(id);
	}
	
	@Override
	public Product saveOrUpdate(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product getById(Long id) {
		return productRepository.findById(id).get();
	}

}
