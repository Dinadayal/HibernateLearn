package com.hibernate.checker.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.checker.model.Location;
@Repository
public interface LocationRepository extends CrudRepository<Location, Integer>{

}
