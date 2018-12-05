package com.niit.FashionShoppingBackend.Dao;

import java.util.List;
import com.niit.FashionShoppingBackend.model.Order;

public interface OrderDao {
	public boolean saveorupdate(Order order);
	public boolean delete(Order Order);
	public Order setOrder(String ordId);
	public Order getOrder(String ordId);
	public List<Order> list();
	List<Order>ordlist();
}
