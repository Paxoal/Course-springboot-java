package com.example.course.reposituries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
