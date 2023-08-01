package com.aprendendojava.springjava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendendojava.springjava.entities.OrderItem;
import com.aprendendojava.springjava.repositories.OrderItemRepository;

@Service
public class OrderItemService {
	
	@Autowired	
	private OrderItemRepository OrderItemRepository;
	
	public List<OrderItem> findAll() {
		return OrderItemRepository.findAll();
	}
	
	public OrderItem findById(Long id) {
		Optional<OrderItem> OrderItem = OrderItemRepository.findById(id);
		return OrderItem.get();
	}
	
	

}
