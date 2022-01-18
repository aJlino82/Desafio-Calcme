package com.calcme.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.calcme.entities.User;

public interface UserRepository extends MongoRepository<User, String> {

}
