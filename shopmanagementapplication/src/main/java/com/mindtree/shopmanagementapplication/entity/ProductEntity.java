package com.mindtree.shopmanagementapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="productId")
	private int productId;
	@Column(name="productName")
	private String productName;
	@Column(name="cost")
	private double cost;
	@ManyToOne
	@JoinColumn(name = "shopNumber",nullable=false)
	private ShopEntity shopEntity;
	@ManyToOne
	@JoinColumn(name = "brandNumber",nullable=false)
	private BrandEntity brandEntity;
	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductEntity(int productId, String productName, double cost, ShopEntity shopEntity,
			BrandEntity brandEntity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.cost = cost;
		this.shopEntity = shopEntity;
		this.brandEntity = brandEntity;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public ShopEntity getShopEntity() {
		return shopEntity;
	}
	public void setShopEntity(ShopEntity shopEntity) {
		this.shopEntity = shopEntity;
	}
	public BrandEntity getBrandEntity() {
		return brandEntity;
	}
	public void setBrandEntity(BrandEntity brandEntity) {
		this.brandEntity = brandEntity;
	}

}
