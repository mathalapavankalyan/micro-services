package com.demo.order_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public List<String> getOrders() {
        return List.of("Order-1", "Order-2", "Order-3");
    }
}