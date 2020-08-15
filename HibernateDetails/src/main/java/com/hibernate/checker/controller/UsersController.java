package com.hibernate.checker.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.checker.model.Users;
import com.hibernate.checker.service.UsersService;

@RestController
public class UsersController {
	
	@Autowired
	private UsersService service;
	
	@GetMapping("/users")
	public List<Users> getAllUsers() {
		return service.getData();
	}
	@GetMapping("/users/{id}")
	public Optional<Users> getUser(@PathVariable Integer id) {
		return service.getSingle(id);
	}

}
