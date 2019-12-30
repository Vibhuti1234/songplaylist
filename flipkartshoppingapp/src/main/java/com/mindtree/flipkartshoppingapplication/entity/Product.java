package com.mindtree.flipkartshoppingapplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productId;
	private String productType;
	private String productColor;
	private String productName;
	private double discount;
	private double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(int productId, String productType, String productColor, String productName, double discount,
			double price) {
		super();
		this.productId = productId;
		this.productType = productType;
		this.productColor = productColor;
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


	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
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
