package com.mindtree.ComicSuperHeroManagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class SuperHero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int superHeroId;
	private String superHeroName;
	@OneToMany(mappedBy = "superhero",cascade = CascadeType.ALL)
	List<Power> powerlist;
	@ManyToOne(cascade = CascadeType.ALL)
	private Comics comics;
	public int getSuperHeroId() {
		return superHeroId;
	}
	public void setSuperHeroId(int superHeroId) {
		this.superHeroId = superHeroId;
	}
	public String getSuperHeroName() {
		return superHeroName;
	}
	public void setSuperHeroName(String superHeroName) {
		this.superHeroName = superHeroName;
	}
	public List<Power> getPowerlist() {
		return powerlist;
	}
	public void setPowerlist(List<Power> powerlist) {
		this.powerlist = powerlist;
	}
	public Comics getComics() {
		return comics;
	}
	public void setComics(Comics comics) {
		this.comics = comics;
	}
	@Override
	public String toString() {
		return "SuperHero [superHeroId=" + superHeroId + ", superHeroName=" + superHeroName + ", powerlist=" + powerlist
				+ ", comics=" + comics + "]";
	}
	public SuperHero(int superHeroId, String superHeroName, List<Power> powerlist, Comics comics) {
		super();
		this.superHeroId = superHeroId;
		this.superHeroName = superHeroName;
		this.powerlist = powerlist;
		this.comics = comics;
	}
	public SuperHero() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
