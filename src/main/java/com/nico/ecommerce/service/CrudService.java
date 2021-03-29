package com.nico.ecommerce.service;

import java.util.List;

public interface CrudService<T> {
	
	List<T> listAll();
	
	T getById(Long id);
	
	T saveOrUpdate(T object);
	
	void delete(Long id);
	
	
}
