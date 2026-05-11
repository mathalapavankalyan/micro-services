package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.entity.User;
import com.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	 private final UserRepository userRepository;

	  
	
	public User createUser(User user) {
		return userRepository.save(user);
	}



	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}



	public Optional<User> getUserById(int id) {
		
		return userRepository.findById(id);
	}
	
}
