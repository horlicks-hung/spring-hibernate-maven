package com.platinumwill.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.platinumwill.entity.Product;
import com.platinumwill.entity.ProductSales;
import com.platinumwill.service.PlatinumService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/test-beans.xml" })
public class PlatinumTest extends AbstractTest {
	
	private PlatinumService platinumService;
	public PlatinumService getPlatinumService() {
		return this.platinumService;
	}
	@Autowired
	public void setPlatinumService(PlatinumService platinumService) {
		this.platinumService = platinumService;
	}

	@Test
	public void testPlatinumService() {
		Product product = (Product) this.getPlatinumService().queryProduct(1);
		getLogger().debug(product.getCreateDate().toString());
		List<ProductSales> sales = product.getSales();
		String isSalesNull = String.valueOf(sales == null);
		getLogger().debug(isSalesNull);
		if (sales != null) {
			String salesSetSize = String.valueOf(sales.size());
			getLogger().debug(salesSetSize);
		}
	}

}
