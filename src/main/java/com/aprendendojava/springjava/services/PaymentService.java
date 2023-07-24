package com.aprendendojava.springjava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendendojava.springjava.entities.Payment;
import com.aprendendojava.springjava.repositories.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired	
	private PaymentRepository PaymentRepository;
	
	public List<Payment> findAll() {
		return PaymentRepository.findAll();
	}
	
	public Payment findById(Long id) {
		Optional<Payment> Payment = PaymentRepository.findById(id);
		return Payment.get();
	}
	
	

}
