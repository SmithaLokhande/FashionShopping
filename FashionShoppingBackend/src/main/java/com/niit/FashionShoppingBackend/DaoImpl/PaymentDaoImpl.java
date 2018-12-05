package com.niit.FashionShoppingBackend.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.FashionShoppingBackend.Dao.PaymentDao;
import com.niit.FashionShoppingBackend.model.Payment;

public class PaymentDaoImpl implements PaymentDao{
	@Autowired
	SessionFactory  sessionfactory;
	public PaymentDaoImpl(SessionFactory sessionfactory) 
	{
	this.sessionfactory=sessionfactory;
	}
	
	public boolean saveorupdate(Payment payment) {
		sessionfactory.getCurrentSession().saveOrUpdate(payment);
		return true;
	}

	public boolean delete(Payment payment) {
		sessionfactory.getCurrentSession().delete(payment);
		return true;
	}

	public Payment getPayment(String payId) {
		String s="From Payment where payId='+payId+'";
		Query q=sessionfactory.getCurrentSession().createQuery(s);
		List<Payment>lpayment=(List<Payment>)q.list();
		if(lpayment==null||lpayment.isEmpty())
		{
			System.out.println("Payment not found");
			
			return null;
			
			}
			else
			{
				System.out.println("Payment List");
				return lpayment.get(0);
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	public List<Payment> paylist() {
		// TODO Auto-generated method stub
		return null;
	}

}
