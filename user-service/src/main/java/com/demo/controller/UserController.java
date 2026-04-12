package com.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.User;
import com.demo.repository.UserRepository;
import com.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    public UserController(UserService userService , UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }
    
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getUsers() throws InterruptedException {
        return userService.getAllUsers();
    }
}
