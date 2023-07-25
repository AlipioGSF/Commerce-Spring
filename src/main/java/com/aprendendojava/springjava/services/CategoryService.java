package com.aprendendojava.springjava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendendojava.springjava.entities.Category;
import com.aprendendojava.springjava.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired	
	private CategoryRepository CategoryRepository;
	
	public List<Category> findAll() {
		return CategoryRepository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> Category = CategoryRepository.findById(id);
		return Category.get();
	}
	
	

}
