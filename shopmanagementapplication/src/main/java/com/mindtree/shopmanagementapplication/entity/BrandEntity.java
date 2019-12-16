package com.mindtree.shopmanagementapplication.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="brand")
public class BrandEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="brandId")
	private int brandId;
	@Column(name="brandName")
	private String brandName;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="brandEntity")
	private List<ProductEntity> productEntity;
	public BrandEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BrandEntity(int brandId, String brandName, List<ProductEntity> productEntity) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.productEntity = productEntity;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public List<ProductEntity> getProductEntity() {
		return productEntity;
	}
	public void setProductEntity(List<ProductEntity> productEntity) {
		this.productEntity = productEntity;
	}

}
