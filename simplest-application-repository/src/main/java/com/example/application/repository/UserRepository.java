package com.example.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.application.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByCode(String code);
	public User findByName(String name);

}
