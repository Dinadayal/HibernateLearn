package com.hibernate.checker.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.checker.model.Posts;
@Repository
public interface PostsRepository extends CrudRepository<Posts, Integer> {

}
