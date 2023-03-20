package com.kennymarreira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kennymarreira.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
