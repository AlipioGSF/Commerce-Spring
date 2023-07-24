package com.aprendendojava.springjava.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aprendendojava.springjava.entities.Order;
import com.aprendendojava.springjava.entities.User;
import com.aprendendojava.springjava.entities.enums.OrderStatus;
import com.aprendendojava.springjava.repositories.OrderRepository;
import com.aprendendojava.springjava.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null,"Apolinario Silva", "apolio@gmail.com", "40028922", "12345n 6");
		User u2 = new User(null,"Apilio Jorge", "apilio@gmail.com", "12345678", "123456");
		
		Order o1 = new Order(null,Instant.parse("2023-07-24T12:05:00Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null,Instant.parse("2023-07-25T12:05:00Z"), OrderStatus.WAITING_PAYMENT,u2);
		Order o3 = new Order(null,Instant.parse("2023-07-26T12:05:00Z"), OrderStatus.WAITING_PAYMENT ,u2);
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
	
	
}
