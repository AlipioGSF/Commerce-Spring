package com.aprendendojava.springjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendojava.springjava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
