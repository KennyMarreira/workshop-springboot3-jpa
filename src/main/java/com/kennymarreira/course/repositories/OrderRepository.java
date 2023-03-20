package com.kennymarreira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kennymarreira.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
