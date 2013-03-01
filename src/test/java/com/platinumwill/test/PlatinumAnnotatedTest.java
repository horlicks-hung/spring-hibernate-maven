package com.platinumwill.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.platinumwill.dao.annotated.PlatinumAnnotatedDao;
import com.platinumwill.entity.annotated.Product;
import com.platinumwill.entity.annotated.ProductSales;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/test-beans.xml", "/beans.xml" })
public class PlatinumAnnotatedTest extends AbstractTest {

	private PlatinumAnnotatedDao dao;
	public PlatinumAnnotatedDao getDao() {
		return this.dao;
	}
	@Autowired
	public void setDao(PlatinumAnnotatedDao dao) {
		this.dao = dao;
	}
	
	@Test
	public void testAnnotatedDao() {
		Product product = this.getDao().queryProduct(1);
		List<ProductSales> salesList = product.getSales();
		getLogger().debug(String.valueOf(salesList.size()));
	}

}
