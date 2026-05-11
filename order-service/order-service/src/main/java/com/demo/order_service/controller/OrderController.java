package com.demo.order_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.order_service.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
	
	private final OrderService orderService;

    @GetMapping
    public List<String> getOrders() {
        return List.of("Order-1", "Order-2", "Order-3");
    }
    
    @GetMapping("/create/{userId}")
    public String createOrder(@PathVariable Long userId) {
        return orderService.createOrder(userId);
    }
}