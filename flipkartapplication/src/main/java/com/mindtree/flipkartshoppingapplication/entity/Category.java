package com.mindtree.flipkartshoppingapplication.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Category {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int categoryId;
@Column(unique=true)
private String categoryName;
@ManyToMany(cascade=CascadeType.PERSIST,mappedBy="categories")
private List<Brand> brands=new ArrayList<Brand>();

public Category() {
	super();
	// TODO Auto-generated constructor stub
}

public Category(int categoryId, String categoryName, List<Brand> brands) {
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
public List<Brand> getBrands() {
	return brands;
}
public void setBrands(List<Brand> brands) {
	this.brands = brands;
}


}
