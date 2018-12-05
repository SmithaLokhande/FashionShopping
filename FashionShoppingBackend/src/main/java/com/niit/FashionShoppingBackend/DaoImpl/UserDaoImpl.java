package com.niit.FashionShoppingBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.FashionShoppingBackend.Dao.UserDao;
import com.niit.FashionShoppingBackend.model.Supplier;
import com.niit.FashionShoppingBackend.model.User;

public class UserDaoImpl implements UserDao{
	@Autowired
	SessionFactory sessionFactory;
	
	public UserDaoImpl(SessionFactory sessionFactory) 
	{
	this.sessionFactory=sessionFactory;
	}

	public boolean saveorupdate(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);

		return true;
	}

	public boolean delete(User user) {
		sessionFactory.getCurrentSession().delete(user);
		return true;
	}

	public User getuser(String userId) {
		String s="From User where userId='+userId+'";
		Query q=sessionFactory.getCurrentSession().createQuery(s);
		List<User>luser=(List<User>)q.list();
		if(luser==null||luser.isEmpty())
		{
			System.out.println("User not found");
			
			return null;
			
			}
			else
			{
				System.out.println("User List");
				return luser.get(0);
			}
		}

	public List<User> list() {
		List<User> Users=(List<User>)sessionFactory.getCurrentSession().createCriteria(User.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return Users;

	}

	public User getsupplier(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUser(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
