package com.mindtree.bikedealerbrandapplication.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Brand {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int brandId;
	@Column(unique=true)
	private String brandName;
	@Column(nullable=true)
	private double investment;
	@JsonManagedReference
	@OneToMany(cascade=CascadeType.ALL,mappedBy="brand")
	private List<Dealers> dealers=new ArrayList<Dealers>();
	@JsonManagedReference
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="brandId")
	private List<Bike> bikes=new ArrayList<Bike>();
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Brand(int brandId, String brandName, double investment, List<Dealers> dealers, List<Bike> bikes) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.investment = investment;
		this.dealers = dealers;
		this.bikes = bikes;
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
	public double getInvestment() {
		return investment;
	}
	public void setInvestment(double investment) {
		this.investment = investment;
	}
	public List<Dealers> getDealers() {
		return dealers;
	}
	public void setDealers(List<Dealers> dealers) {
		this.dealers = dealers;
	}
	public List<Bike> getBikes() {
		return bikes;
	}
	public void setBikes(List<Bike> bikes) {
		this.bikes = bikes;
	}
	

}
