package com.aprendendojava.springjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendojava.springjava.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
