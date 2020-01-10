package com.mindtree.ComicSuperHeroManagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Power {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int powerId;
	private String powerName;
	private int powerDamage;
	@ManyToOne(cascade = CascadeType.ALL)
	private SuperHero superhero;
	public int getPowerId() {
		return powerId;
	}
	public void setPowerId(int powerId) {
		this.powerId = powerId;
	}
	public String getPowerName() {
		return powerName;
	}
	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}
	public int getPowerDamage() {
		return powerDamage;
	}
	public void setPowerDamage(int powerDamage) {
		this.powerDamage = powerDamage;
	}
	public SuperHero getSuperhero() {
		return superhero;
	}
	public void setSuperhero(SuperHero superhero) {
		this.superhero = superhero;
	}
	@Override
	public String toString() {
		return "Power [powerId=" + powerId + ", powerName=" + powerName + ", powerDamage=" + powerDamage
				+ ", superhero=" + superhero + "]";
	}
	public Power(int powerId, String powerName, int powerDamage, SuperHero superhero) {
		super();
		this.powerId = powerId;
		this.powerName = powerName;
		this.powerDamage = powerDamage;
		this.superhero = superhero;
	}
	public Power() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
