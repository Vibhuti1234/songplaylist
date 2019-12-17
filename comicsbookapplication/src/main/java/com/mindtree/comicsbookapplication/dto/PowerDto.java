package com.mindtree.comicsbookapplication.dto;

public class PowerDto {
	private int powerId;
	private String powerName;
	private int powerDamage;
	private SuperheroDto superhero;
	public PowerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PowerDto(int powerId, String powerName, int powerDamage, SuperheroDto superhero) {
		super();
		this.powerId = powerId;
		this.powerName = powerName;
		this.powerDamage = powerDamage;
		this.superhero = superhero;
	}
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
	public SuperheroDto getSuperhero() {
		return superhero;
	}
	public void setSuperhero(SuperheroDto superhero) {
		this.superhero = superhero;
	}
	

}
