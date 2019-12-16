package com.mindtree.shopmanagementapplication.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mindtree.shopmanagementapplication.entity.ProductEntity;

public class ShopDto {
	private int shopId;
	private String shopName;
	@JsonIgnore
	private List<ProductDto> productEntity;
	public ShopDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShopDto(int shopId, String shopName, List<ProductDto> productEntity) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.productEntity = productEntity;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<ProductDto> getProductEntity() {
		return productEntity;
	}
	public void setProductEntity(List<ProductDto> productEntity) {
		this.productEntity = productEntity;
	}
	
	
}
