package com.niit.FashionShoppingBackend.model;

import java.beans.Transient;
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
public class Product 
{
	@Id
	private String ProductId;
	private String ProductName;
	private String DoublePrize;
	private String QuantityInt;
	private String Description;
	
	public Product() {
		this.ProductId="PRO"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	@ManyToOne
	@JoinColumn(name="catId")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="supId")
	private Supplier supplier;
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}

	
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getDoublePrize() {
		return DoublePrize;
	}
	public void setDoublePrize(String doublePrize) {
		DoublePrize = doublePrize;
	}
	public String getQuantityInt() {
		return QuantityInt;
	}
	public void setQuantityInt(String quantityInt) {
		QuantityInt = quantityInt;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
}
