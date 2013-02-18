package com.platinumwill.dao;

import org.hibernate.Session;

import com.platinumwill.entity.Product;

public class PlatinumDaoImpl extends AbstractDao implements PlatinumDao {
	
	public Product queryProduct(int id) {
		Session session = this.getSessionFactory().getCurrentSession();
		Product product = (Product) session.get(Product.class, id);
		return product;
	}
}
