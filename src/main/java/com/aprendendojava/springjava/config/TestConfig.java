package com.aprendendojava.springjava.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aprendendojava.springjava.entities.Category;
import com.aprendendojava.springjava.entities.Order;
import com.aprendendojava.springjava.entities.Product;
import com.aprendendojava.springjava.entities.User;
import com.aprendendojava.springjava.entities.enums.OrderStatus;
import com.aprendendojava.springjava.repositories.CategoryRepository;
import com.aprendendojava.springjava.repositories.OrderRepository;
import com.aprendendojava.springjava.repositories.PaymentRepository;
import com.aprendendojava.springjava.repositories.ProductRepository;
import com.aprendendojava.springjava.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
		

		Category c1 = new Category(null, "Eletronics");
		Category c2 = new Category(null, "Books");
		Category c3 = new Category(null, "Computers");
		
		User u1 = new User(null,"Apolinario Silva", "apolio@gmail.com", "40028922", "12345n 6");
		User u2 = new User(null,"Apilio Jorge", "apilio@gmail.com", "12345678", "123456");
		
		Order o1 = new Order(null,Instant.parse("2023-07-24T12:05:00Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null,Instant.parse("2023-07-25T12:05:00Z"), OrderStatus.WAITING_PAYMENT,u2);
		Order o3 = new Order(null,Instant.parse("2023-07-26T12:05:00Z"), OrderStatus.WAITING_PAYMENT ,u2);
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, ""); 
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, ""); 
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, ""); 
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, ""); 
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, ""); 

		
		categoryRepository.saveAll(Arrays.asList(c1,c2,c3));
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
	
	
}
