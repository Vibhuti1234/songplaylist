package com.mindtree.bikedealerbrandapplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Dealers {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dealerId;
	private String dealerName;
	private String dealerAddress;
	@JsonBackReference
	@ManyToOne
	private Brand brand;
	public Dealers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dealers(int dealerId, String dealerName, String dealerAddress, Brand brand) {
		super();
		this.dealerId = dealerId;
		this.dealerName = dealerName;
		this.dealerAddress = dealerAddress;
		this.brand = brand;
	}
	public int getDealerId() {
		return dealerId;
	}
	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public String getDealerAddress() {
		return dealerAddress;
	}
	public void setDealerAddress(String dealerAddress) {
		this.dealerAddress = dealerAddress;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	

}
