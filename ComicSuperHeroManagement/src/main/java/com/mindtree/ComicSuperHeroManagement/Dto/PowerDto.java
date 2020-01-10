package com.mindtree.ComicSuperHeroManagement.Dto;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.ComicSuperHeroManagement.entity.SuperHero;

public class PowerDto {


	private int powerId;
	private String powerName;
	private int powerDamage;
	@JsonIgnoreProperties("powerlist")
	private SuperHeroDto superhero;
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
	public SuperHeroDto getSuperhero() {
		return superhero;
	}
	public void setSuperhero(SuperHeroDto superhero) {
		this.superhero = superhero;
	}
	@Override
	public String toString() {
		return "PowerDto [powerId=" + powerId + ", powerName=" + powerName + ", powerDamage=" + powerDamage
				+ ", superhero=" + superhero + "]";
	}
	public PowerDto(int powerId, String powerName, int powerDamage, SuperHeroDto superhero) {
		super();
		this.powerId = powerId;
		this.powerName = powerName;
		this.powerDamage = powerDamage;
		this.superhero = superhero;
	}
	public PowerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
