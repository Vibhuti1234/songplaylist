package com.mindtree.comicsbookapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="power")
public class Power {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="powerId")
	private int powerId;
	@Column(name="powerName")
	private String powerName;
	@Column(name="powerDamage")
	private int powerDamage;
	@ManyToOne
	private Superhero superhero;
	public Power() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Power(int powerId, String powerName, int powerDamage, Superhero superhero) {
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
	public Superhero getSuperhero() {
		return superhero;
	}
	public void setSuperhero(Superhero superhero) {
		this.superhero = superhero;
	}
	
}
