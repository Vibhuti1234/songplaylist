package com.mindtree.blockmanagementsystem.dto;

public class DishesDto implements Comparable<DishesDto> {
	private int dishId;
	private String dishName;
	private double price;
	private String type;
	public DishesDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DishesDto(int dishId, String dishName, double price, String type) {
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
	@Override
	public int compareTo(DishesDto e) {
		// TODO Auto-generated method stub
		return (int) (this.price-e.price);
	}
	

}
