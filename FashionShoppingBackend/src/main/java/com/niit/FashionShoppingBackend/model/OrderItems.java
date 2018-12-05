package com.niit.FashionShoppingBackend.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table
@Component
public class OrderItems {
	@Id
	private String orderItemId;
	private Double price;
	public OrderItems() {
		this.orderItemId="ORD"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	@ManyToOne
	@JoinColumn(name="orderId")
	private Order order;
	
	public String getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setTotalItems(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setGrandTotal(double d) {
		// TODO Auto-generated method stub
		
	}

}
