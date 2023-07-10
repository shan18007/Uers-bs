package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.enities.User;
import com.ecom.service.UserService;

@RestController
@RequestMapping("/ecom")
public class HomeController {

	@Autowired
	UserService userService;

	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User newUser) {
	
		User registerUser = null;
		System.out.println("from req body: " + newUser);

		try {
			registerUser = userService.registerUser(newUser);

		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<User>(registerUser, HttpStatus.CREATED);
	
	}
}
