package com.mindtree.jpacafechainmanagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "CAFE")
public class Cafe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cafeId")
	private int cafeId;
	@Column(unique = true, name = "cafeName")
	private String cafeName;
	@Column(name = "cafeRevenue")
	private double cafeRevenue;
	@JsonBackReference
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Manager manager;

	public Cafe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cafe(int cafeId, String cafeName, double cafeRevenue, Manager manager) {
		super();
		this.cafeId = cafeId;
		this.cafeName = cafeName;
		this.cafeRevenue = cafeRevenue;
		this.manager = manager;
	}

	public int getCafeId() {
		return cafeId;
	}

	public void setCafeId(int cafeId) {
		this.cafeId = cafeId;
	}

	public String getCafeName() {
		return cafeName;
	}

	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}

	public double getCafeRevenue() {
		return cafeRevenue;
	}

	public void setCafeRevenue(double cafeRevenue) {
		this.cafeRevenue = cafeRevenue;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Cafe [cafeId=" + cafeId + ", cafeName=" + cafeName + ", cafeRevenue=" + cafeRevenue + ", manager="
				+ manager + "]";
	}

}
