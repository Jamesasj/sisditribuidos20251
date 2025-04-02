package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	List<User> users = new ArrayList<User>();
	
	HelloController(){
		users.add(new User("James", "james@james","123", 1));
		users.add(new User("James", "james@james","123", 1));		
		users.add(new User("James", "james@james","123", 1));	
	}
	
	
	@GetMapping("/")
	public String home() {
		return "Ola mundo do Spring";
	}
		
	@GetMapping("/user")
	public List<User> getUsers() {
		
		return users;
	}
	
	@GetMapping("/userById")
	public User getUserByIndex(@RequestParam(value = "id") int index) {
		return users.get(index);
	}
	
	@PostMapping("/user")
	public User createUser(User newUser) {
		newUser.setId(this.users.size());
		users.add(newUser);
		return newUser;
	}
}
