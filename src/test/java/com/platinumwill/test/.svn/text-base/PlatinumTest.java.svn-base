package com.platinumwill.test;

import junit.framework.TestCase;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.platinumwill.entity.Product;
import com.platinumwill.service.PlatinumService;

public class PlatinumTest extends TestCase {
	
	private static ApplicationContext CONTEXT = new ClassPathXmlApplicationContext("beans.xml");
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Test
	public void testPlatinumService() {
		PlatinumService platinumService = (PlatinumService) CONTEXT.getBean("platinumService");
		Product product = (Product) platinumService.queryProduct(1);
		logger.debug(product.getCreateDate().toString());
	}

}
