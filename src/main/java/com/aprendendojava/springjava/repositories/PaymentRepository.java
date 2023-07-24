package com.aprendendojava.springjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendojava.springjava.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
