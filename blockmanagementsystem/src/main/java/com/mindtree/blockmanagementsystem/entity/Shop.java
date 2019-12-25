package com.mindtree.blockmanagementsystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Shop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int shopId;
	private String shopName;
	private String shopType;
	private double rating;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="shopId")
	private List<Dishes> dishes;
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shop(int shopId, String shopName, String shopType, double rating, List<Dishes> dishes) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.shopType = shopType;
		this.rating = rating;
		this.dishes = dishes;
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
	public String getShopType() {
		return shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public List<Dishes> getDishes() {
		return dishes;
	}
	public void setDishes(List<Dishes> dishes) {
		this.dishes = dishes;
	}
	
}
