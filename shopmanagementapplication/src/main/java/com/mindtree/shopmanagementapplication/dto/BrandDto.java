package com.mindtree.shopmanagementapplication.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mindtree.shopmanagementapplication.entity.ProductEntity;

public class BrandDto {
	private int brandId;
	private String brandName;
	@JsonIgnore
	private List<ProductDto> productEntity;
	public BrandDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BrandDto(int brandId, String brandName, List<ProductDto> productEntity) {
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
	public List<ProductDto> getProductEntity() {
		return productEntity;
	}
	public void setProductEntity(List<ProductDto> productEntity) {
		this.productEntity = productEntity;
	}
	
}
