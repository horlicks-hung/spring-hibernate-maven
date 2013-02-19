package com.platinumwill.entity.annotated;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="product")
public class Product implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private int productId;
	private String name;
	private Integer defaultUnitPrice;
	private Date createDate;

	public Product() {
	}

	public Product(int productId, String name) {
		this.productId = productId;
		this.name = name;
	}

	public Product(int productId, String name, Integer defaultUnitPrice,
			Date createDate) {
		this.productId = productId;
		this.name = name;
		this.defaultUnitPrice = defaultUnitPrice;
		this.createDate = createDate;
	}

	@Id
	@Column(name = "product_id")
	public int getProductId() {
		return this.productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Basic
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "defaultUnitPrice")
	public Integer getDefaultUnitPrice() {
		return this.defaultUnitPrice;
	}
	public void setDefaultUnitPrice(Integer defaultUnitPrice) {
		this.defaultUnitPrice = defaultUnitPrice;
	}

	@Column(name = "createDate")
	@Temporal(TemporalType.TIME)
	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
