package com.niit.FashionShoppingBackend.model;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class CartItems {
	@Id
	private String cartItemId;
	@ManyToOne
	@JoinColumn(name="cartId")
	private Cart cart;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="prodId")
	private Product product;
	private Double price;
	public CartItems() {
		this.cartItemId="CARTITEM"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	public String getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(String cartItemId) {
		this.cartItemId = cartItemId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
