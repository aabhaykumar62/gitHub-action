package com.example.react;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.react.service.DataGenrationService;

@SpringBootApplication
public class EmployeeSpringBootReactApplication {

	@Autowired
	DataGenrationService dataGenrationService;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeSpringBootReactApplication.class, args);
		System.out.println("Start This is SpringBoot with react application");
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		dataGenrationService.generateRecords(10000);
//	}

}
