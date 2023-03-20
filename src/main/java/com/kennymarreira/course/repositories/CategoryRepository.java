package com.kennymarreira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kennymarreira.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
