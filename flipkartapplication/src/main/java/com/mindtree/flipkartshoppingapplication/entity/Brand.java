package com.mindtree.flipkartshoppingapplication.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity 
public class Brand {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int brandId;
@Column(unique=true) 
private String brandName;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="brandId")
private List<Product> products=new ArrayList<Product>();
@ManyToMany(cascade=CascadeType.PERSIST)
private List<Category> categories=new ArrayList<Category>();
public Brand() {
	super();
	// TODO Auto-generated constructor stub
}

public Brand(int brandId, String brandName, List<Product> products, List<Category> categories) {
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
public List<Category> getCategories() {
	return categories;
}
public void setCategories(List<Category> categories) {
	this.categories = categories;
}

public List<Product> getProducts() {
	return products;
}

public void setProducts(List<Product> products) {
	this.products = products;
}

}
