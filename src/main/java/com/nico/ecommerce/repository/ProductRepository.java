package com.nico.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nico.ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
