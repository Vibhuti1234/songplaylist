package com.mindtree.flipkartshoppingapplication.dto;

public class ProductDto {
	private int productId;
	private String productColor;
	private String productType;
	private String productName;
	private double discount;
	private double price;
	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ProductDto(int productId, String productColor, String productType, String productName, double discount,
			double price) {
		super();
		this.productId = productId;
		this.productColor = productColor;
		this.productType = productType;
		this.productName = productName;
		this.discount = discount;
		this.price = price;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
