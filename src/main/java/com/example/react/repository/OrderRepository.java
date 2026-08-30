package com.example.react.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.react.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
