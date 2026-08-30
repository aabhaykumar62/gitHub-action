package com.example.react.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.react.model.Order;
import com.example.react.repository.OrderRepository;

import jakarta.transaction.Transactional;

@Service
public class DataGenrationService {
	
	@Autowired
	OrderRepository orderRepository;

	@Transactional
	public List<Order> generateRecords(int count) {
        List<Order> orders = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
        	Order order=new Order();
        	order.setOrderId(UUID.randomUUID().toString());
        	order.setUserId("User" + i);
        	order.setEmail("abhay@hcl.com");
        	order.setOrderDate(LocalDateTime.now());
        	orders.add(order);
        	
            }
        orderRepository.saveAll(orders);
		return orders;
        
	}
}
