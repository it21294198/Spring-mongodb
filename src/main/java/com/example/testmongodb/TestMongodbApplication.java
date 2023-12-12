package com.example.testmongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.testmongodb.model.User;
import com.example.testmongodb.service.UserService;

@SpringBootApplication
public class TestMongodbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TestMongodbApplication.class, args);
	}
	
	@Autowired
	public UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService =  userService;
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			
//			add user data to Database before start operations
			userService.insertInitialData();
			
//			add user
			userService.saveOrUpdate(new User(3,"hello1","hello@1234","12341234"));
			
//			view all users
			List<User> users = userService.getAllEntities();
			for(User user:users) {
				System.out.print(user);
				user.toString();
			}
			
//			get as single user by Id
			System.out.print(userService.getEntityById(1));
			
//			delete user by Id
			userService.deleteEntityById(2);
			
			System.out.print("Project ran");

		}catch (Exception e) {
			System.out.print(e);
		}
	}

}
