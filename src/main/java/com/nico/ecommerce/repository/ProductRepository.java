package com.nico.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nico.ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	List<Product> findByNameContaining(String name);
}
