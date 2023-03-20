package com.kennymarreira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kennymarreira.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
