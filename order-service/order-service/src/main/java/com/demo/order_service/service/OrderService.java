package com.demo.order_service.service;

import org.springframework.stereotype.Service;

import com.demo.order_service.client.UserClient;
import com.demo.order_service.client.UserResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

	private final UserClient userClient;
	
	 public String createOrder(Long userId) {

	        UserResponse user = userClient.getUserById(userId);

	        return "Order created for user: " + user.getName();
	    }
}
