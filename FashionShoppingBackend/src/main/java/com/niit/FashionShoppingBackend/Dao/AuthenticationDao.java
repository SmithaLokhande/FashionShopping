package com.niit.FashionShoppingBackend.Dao;

import java.util.List;

import com.niit.FashionShoppingBackend.model.Authentication;

public interface AuthenticationDao {
	public boolean saveorupdateAunthetication(Authentication authentication);
	public boolean deleteAuthentication(Authentication authentication);
	public Authentication getAuthentication(String roleId);
	public List<Authentication>list();


}
