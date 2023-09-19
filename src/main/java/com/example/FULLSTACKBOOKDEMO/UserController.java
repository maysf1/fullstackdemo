package com.example.FULLSTACKBOOKDEMO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {
	
	@Autowired 
	UserRepository userRepository;

	// search for all users
		@GetMapping("/users")
		public String getAllUsers(Model model) {
			model.addAttribute("allusers", userRepository.findAll());
			return "users";
		}
	// search for users by id
		@GetMapping("/users/id/{id}")
		public String getUsersById(@PathVariable(name="id") Integer id, Model model) {
			model.addAttribute("allusers", userRepository.getUsersById(id));
			return "users";
		}		
}
