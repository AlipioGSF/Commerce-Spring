package com.aprendendojava.springjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendojava.springjava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
