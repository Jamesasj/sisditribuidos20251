package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	ArrayList<User> users = new ArrayList<User>();
	users.add(new User("James", "james@james","123", 1));
	
	
	@GetMapping("/")
	public String home() {
		return "Ola mundo do Spring";
	}
		
	@GetMapping("/user")
	public String[] getUsers() {
		String [] users = {"James", "Matheus", "Gabriel"};
		return users;
	}
	
	@GetMapping("/userById")
	public String getUserByIndex(@RequestParam(value = "id") int index) {
		String [] users = {"James", "Matheus", "Gabriel"};
		return users[index];
	}
	
	@PostMapping("/user")
	public User createUser(User newUser) {
		newUser.setId(this.users.length);
		return newUser;
	}
}
