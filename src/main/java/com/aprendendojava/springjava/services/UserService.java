package com.aprendendojava.springjava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.aprendendojava.springjava.entities.User;
import com.aprendendojava.springjava.repositories.UserRepository;
import com.aprendendojava.springjava.services.exceptions.DatabaseException;
import com.aprendendojava.springjava.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired	
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User user) {
		return userRepository.save(user);
	}
	
	public void delete(Long id) {
		try {			
			if(userRepository.existsById(id)) {
				userRepository.deleteById(id);				
			}else {
				throw new ResourceNotFoundException(id);
			}
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {			
	        throw new DatabaseException(e.getMessage());		
	    }	
	}
	
	public User update(Long id, User user) {
		User entity = userRepository.getReferenceById(id);
		updateData(entity, user);
		return userRepository.save(entity);
	}

	private void updateData(User entity, User user) {
		entity.setEmail(user.getEmail());
		entity.setName(user.getName());
		entity.setPhone(user.getPhone());
	}
	

}
