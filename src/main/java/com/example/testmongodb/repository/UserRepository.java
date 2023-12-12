package com.example.testmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.testmongodb.model.User;

public interface UserRepository extends MongoRepository <User,Integer>{

}
