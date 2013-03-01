package com.platinumwill.dao.annotated;

import org.hibernate.Session;

import com.platinumwill.dao.AbstractDao;
import com.platinumwill.entity.annotated.Product;

public class PlatinumAnnotatedDaoImpl extends AbstractDao implements
		PlatinumAnnotatedDao {

	public Product queryProduct(int id) {
		Session session = this.getSessionFactory().getCurrentSession();
		Product product = (Product) session.get(Product.class, id);
		return product;
	}

}
