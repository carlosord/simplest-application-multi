package com.example.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.model.User;
import com.example.application.service.UserService;

@RestController
@RequestMapping("users/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping()
	public ResponseEntity<List<User>> index() {
		return ResponseEntity.ok(userService.findAll());
	}
	
	@PostMapping()
	public ResponseEntity<User> create(User p) {
		return ResponseEntity.ok(userService.create(p));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> id(@PathVariable("id") Long id) {
		return ResponseEntity.ok(userService.findById(id));
	}
	
	@GetMapping("/code/{code}")
	public ResponseEntity<User> code(@PathVariable("code") String code) {
		return ResponseEntity.ok(userService.findByCode(code));
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<User> name(@PathVariable("name") String name) {
		return ResponseEntity.ok(userService.findByName(name));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<User> delete(@PathVariable("id") Long id) {
		return ResponseEntity.ok(userService.delete(id));
	}

}
