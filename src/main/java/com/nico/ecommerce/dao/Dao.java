package com.nico.ecommerce.dao;

import java.util.List;

public interface Dao<T> {

	void save(T t);
	
	void update(T t);
	
	void delete(long id);
	
	List<T> list();
}
