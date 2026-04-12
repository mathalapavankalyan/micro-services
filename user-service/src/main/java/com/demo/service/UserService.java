package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.User;
import com.demo.repository.UserRepository;

@Service
public class UserService {

	 private final UserRepository userRepository;

	    public UserService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	
	public List<User> getAllUsers() throws InterruptedException {
        Thread.sleep(200);   // simulate blocking workload
        return userRepository.findAll();
    }
	
}
