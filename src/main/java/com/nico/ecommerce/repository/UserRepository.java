package com.nico.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.nico.ecommerce.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
