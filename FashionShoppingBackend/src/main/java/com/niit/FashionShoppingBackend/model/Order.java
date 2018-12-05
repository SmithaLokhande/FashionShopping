package com.niit.FashionShoppingBackend.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class Order {
	@Id
	private String orderId;
	private Integer TotalItems;
	public Double GrandTotal;
	
	public Order() {
		this.orderId="order"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	@OneToOne
	@JoinColumn(name="billId") 
	private Billing Billing;
	
	@OneToOne
	@JoinColumn(name="shipId")
	private Shipping shipping;
	
	@OneToOne
	@JoinColumn(name="userId")
	private User user;
	
	@OneToMany(mappedBy="order")
	private List<OrderItems> orderItems;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Integer getTotalItems() {
		return TotalItems;
	}
	public void setTotalItems(Integer totalItems) {
		TotalItems = totalItems;
	}
	public Double getGrandTotal() {
		return GrandTotal;
	}
	public void setGrandTotal(Double grandTotal) {
		GrandTotal = grandTotal;
	}
	
	
}
