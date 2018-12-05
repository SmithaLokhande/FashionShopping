package com.niit.FashionShoppingBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.FashionShoppingBackend.Dao.CartItemsDao;
import com.niit.FashionShoppingBackend.model.CartItems;

public class CartItemsDaoImpl implements CartItemsDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public CartItemsDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}

	public boolean saveorupdate(CartItems cartitems) {
		sessionFactory.getCurrentSession().saveOrUpdate(cartitems);
		return true;
	}

	public boolean delete(CartItems cartitems) {
		sessionFactory.getCurrentSession().delete(cartitems);
		return true;
	}

	public CartItems getCartItems(String caiId) {
		String s="From CartItems where CartItemsId='+CartItemsId+'";
		Query q=sessionFactory.getCurrentSession().createQuery(s);
		List<CartItems>lCartItems=(List<CartItems>)q.list();
		if(lCartItems==null||lCartItems.isEmpty())
		{
			System.out.println("CartItems not found");
			
			return null;
			
			}
			else
			{
				System.out.println("CartItems List");
				return lCartItems.get(0);
			}
		}

	public List<CartItems> cailist() {
		List<CartItems> cartItems =(List<CartItems>) sessionFactory.getCurrentSession().createCriteria(CartItems.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return cartItems;
	
	}

}
