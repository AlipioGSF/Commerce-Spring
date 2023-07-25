package com.aprendendojava.springjava.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aprendendojava.springjava.entities.Payment;
import com.aprendendojava.springjava.services.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {
	
	@Autowired
	private PaymentService service;
	
	
	@GetMapping
	public ResponseEntity<List<Payment>> findAll(){
		List<Payment> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Payment> findById(@PathVariable Long id){
		Payment Payment = service.findById(id);
		return ResponseEntity.ok().body(Payment);
	}
	
}
