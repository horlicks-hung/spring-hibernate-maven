package com.platinumwill.service;

import com.platinumwill.dao.PlatinumDao;
import com.platinumwill.entity.Product;

public class PlatinumServiceImpl implements PlatinumService {
	public Product queryProduct(int id) {
		Product result = this.getPlatinumDao().queryProduct(id);
		return result;
	}
	
	PlatinumDao platinumDao;
	public PlatinumDao getPlatinumDao() {
		return this.platinumDao;
	}
	public void setPlatinumDao(PlatinumDao platinumDao) {
		this.platinumDao = platinumDao;
	}
	
}
