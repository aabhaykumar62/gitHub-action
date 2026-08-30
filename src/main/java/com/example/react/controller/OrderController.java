package com.example.react.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.react.model.Order;
import com.example.react.service.DataGenrationService;

@RestController
@RequestMapping("/orderDetails")
public class OrderController {

	@Autowired
	private DataGenrationService dataGenrationService;
	
	@PostMapping("/genrate")
		public List<Order> getrateloader(@RequestParam int count){
			return dataGenrationService.generateRecords(count);
				
		}
	
}
