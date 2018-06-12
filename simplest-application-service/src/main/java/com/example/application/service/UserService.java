package com.example.application.service;

import java.util.List;

import com.example.application.model.User;

public interface UserService {
		
	public User create(User p);
	public User findById(Long id);
	public User findByName(String name);
	public User findByCode(String code);
	public List<User> findAll();
	public User delete(Long id);

}
