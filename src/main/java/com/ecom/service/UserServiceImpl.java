package com.ecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.dao.UserRepository;
import com.ecom.enities.LoginUser;
import com.ecom.enities.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public User registerUser(User newUser) {
		userRepo.save(newUser);
		System.out.println("User saved in db: "+newUser);
		return newUser;
	}

	@Override
	public User validateUser(LoginUser loginUser) {
		return null;
	}

	
}
