package com.nico.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.nico.ecommerce.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{

}
