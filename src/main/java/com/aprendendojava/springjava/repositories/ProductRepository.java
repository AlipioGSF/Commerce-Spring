package com.aprendendojava.springjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendojava.springjava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
