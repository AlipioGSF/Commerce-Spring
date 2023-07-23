package com.aprendendojava.springjava.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aprendendojava.springjava.entities.User;
import com.aprendendojava.springjava.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null,"Apolinario Silva", "apolio@gmail.com", "40028922", "123456");
		User u2 = new User(null,"Apilio Jorge", "apilio@gmail.com", "12345678", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
}
