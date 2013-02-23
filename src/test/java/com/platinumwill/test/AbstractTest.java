package com.platinumwill.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

public class AbstractTest extends AbstractTransactionalJUnit4SpringContextTests {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	protected Logger getLogger() {
		return this.logger;
	}
	
}
