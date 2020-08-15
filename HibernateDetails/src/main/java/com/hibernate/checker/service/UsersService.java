package com.hibernate.checker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.checker.dao.UsersRepository;
import com.hibernate.checker.model.Users;

@Service
public class UsersService {

	@Autowired
	private UsersRepository repository;
	
	public List<Users> getData() {
		
		return (List<Users>) repository.findAll();
	}

	public Optional<Users> getSingle(Integer  id) {
		
		return repository.findById(id);
	}

}
