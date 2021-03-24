package com.nico.ecommerce.dao;

import java.util.List;

public interface Dao<T> {
	List<T> getAll();
	void save(T t);
	void update(T t, String[] param);
	void delete(T t);
}
