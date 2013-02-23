package com.platinumwill.entity.annotated;

// Generated 2013/2/22 04:45:43 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ProductSales generated by hbm2java
 */
@Entity
@Table(name = "product_sales")
public class ProductSales implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private int saleId;
	private int productId;
	private Date saleBeginDate;
	private int quantity;

	public ProductSales() {
	}

	public ProductSales(int saleId, int productId, Date saleBeginDate,
			int quantity) {
		this.saleId = saleId;
		this.productId = productId;
		this.saleBeginDate = saleBeginDate;
		this.quantity = quantity;
	}

	@Id
	@Column(name = "sale_id", unique = true, nullable = false)
	public int getSaleId() {
		return this.saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	@Column(name = "product_id", nullable = false)
	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sale_begin_date", nullable = false, length = 19)
	public Date getSaleBeginDate() {
		return this.saleBeginDate;
	}

	public void setSaleBeginDate(Date saleBeginDate) {
		this.saleBeginDate = saleBeginDate;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}