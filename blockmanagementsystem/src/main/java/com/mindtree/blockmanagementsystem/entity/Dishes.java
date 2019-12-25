package com.mindtree.blockmanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dishes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dishId;
	private String dishName;
	private double price;
	private String type;
	public Dishes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dishes(int dishId, String dishName, double price, String type) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.price = price;
		this.type = type;
	}
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
