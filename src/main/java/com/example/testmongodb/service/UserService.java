package com.example.testmongodb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testmongodb.model.User;
import com.example.testmongodb.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
	
    private  UserRepository repository;

    @Autowired
    public void setUserRepo(UserRepository repository) {
        this.repository = repository;
    }

    public User saveOrUpdate(User entity) {
        return repository.save(entity);
    }

    public List<User> getAllEntities() {
        return repository.findAll();
    }

    public Optional<User> getEntityById(int id) {
        return repository.findById(id);
    }

    public void deleteEntityById(int id) {
        repository.deleteById(id);
    }
    
    public void insertInitialData()throws IOException {
    	byte[] jsonData = Files.readAllBytes(Paths.get("src/main/resources/users.json"));

        // Map JSON to list of User objects
        List<User> users = Arrays.asList(new ObjectMapper().readValue(jsonData, User[].class));

        repository.saveAll(users);
    }
    
}

