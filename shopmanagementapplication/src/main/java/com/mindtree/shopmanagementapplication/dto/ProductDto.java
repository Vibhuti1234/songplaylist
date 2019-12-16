package com.mindtree.shopmanagementapplication.dto;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.mindtree.shopmanagementapplication.entity.BrandEntity;
import com.mindtree.shopmanagementapplication.entity.ShopEntity;

public class ProductDto {
	private int productId;
	private String productName;
	private double cost;
	private ShopDto shopEntity;
	private BrandDto brandEntity;
	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDto(int productId, String productName, double cost, ShopDto shopEntity, BrandDto brandEntity) {
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
	public ShopDto getShopEntity() {
		return shopEntity;
	}
	public void setShopEntity(ShopDto shopEntity) {
		this.shopEntity = shopEntity;
	}
	public BrandDto getBrandEntity() {
		return brandEntity;
	}
	public void setBrandEntity(BrandDto brandEntity) {
		this.brandEntity = brandEntity;
	}
	


}
