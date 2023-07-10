package com.ecom.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecom.enities.LoginUser;
import com.ecom.enities.User;

public interface UserService {

	public User registerUser(User newUser);
	public User validateUser(LoginUser loginUser);
	
}
