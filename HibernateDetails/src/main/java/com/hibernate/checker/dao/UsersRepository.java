package com.hibernate.checker.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.checker.model.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer> {

}
