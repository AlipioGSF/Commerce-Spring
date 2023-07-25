package com.aprendendojava.springjava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendendojava.springjava.entities.Product;
import com.aprendendojava.springjava.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired	
	private ProductRepository ProductRepository;
	
	public List<Product> findAll() {
		return ProductRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> Product = ProductRepository.findById(id);
		return Product.get();
	}
	
	

}
