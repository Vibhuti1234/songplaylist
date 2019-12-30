package com.mindtree.flipkartshoppingapplication.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BrandDto {
	private int brandId;

	private String brandName;
    @JsonIgnore
	private List<ProductDto> products=new ArrayList<ProductDto>();
     @JsonIgnore
	private List<CategoryDto> categories=new ArrayList<CategoryDto>();
	public BrandDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BrandDto(int brandId, String brandName, List<ProductDto> products, List<CategoryDto> categories) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.products = products;
		this.categories = categories;
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
	public List<ProductDto> getProducts() {
		return products;
	}
	public void setProducts(List<ProductDto> products) {
		this.products = products;
	}
	public List<CategoryDto> getCategories() {
		return categories;
	}
	public void setCategories(List<CategoryDto> categories) {
		this.categories = categories;
	}

}
