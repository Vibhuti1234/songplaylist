package com.mindtree.blockmanagementsystem.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ShopDto {
	private int shopId;
	private String shopName;
	private String shopType;
	private double rating;
	@JsonIgnore
	private List<DishesDto> dishes;

	public ShopDto() {
		super();
	}

	public ShopDto(int shopId, String shopName, String shopType, double rating, List<DishesDto> dishes) {
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

	public List<DishesDto> getDishes() {
		return dishes;
	}

	public void setDishes(List<DishesDto> dishes) {
		this.dishes = dishes;
	}

}
