package com.example.react.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "orders") // Escaping the table name to avoid conflicts with reserved keywords
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "user_id")
    private String userId;

    @Column(name="email")
    private String email;
    
    @Column(name = "order_date", columnDefinition = "datetime")
    private LocalDateTime orderDate;
    // Constructors, getters, and setters
    public Order() {}

    public Order(String orderId, String userId, String email,LocalDateTime orderDate ) {
        this.orderId = orderId;
        this.userId = userId;
        this.email = email;
        this.orderDate=orderDate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime localDateTime) {
		this.orderDate = localDateTime;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderId=" + orderId + ", userId=" + userId + ", email=" + email + ", orderDate="
				+ orderDate + "]";
	}

    
}
