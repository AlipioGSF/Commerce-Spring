package com.aprendendojava.springjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendojava.springjava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
