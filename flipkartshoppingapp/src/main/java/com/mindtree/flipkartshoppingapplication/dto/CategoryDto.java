package com.mindtree.flipkartshoppingapplication.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CategoryDto {
	private int categoryId;
	private String categoryName;
	@JsonIgnore
	private List<BrandDto> brands=new ArrayList<BrandDto>();
	public CategoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoryDto(int categoryId, String categoryName, List<BrandDto> brands) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.brands = brands;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List<BrandDto> getBrands() {
		return brands;
	}
	public void setBrands(List<BrandDto> brands) {
		this.brands = brands;
	}
	
}
