package com.mindtree.ComicSuperHeroManagement.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Comics {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int comicsId;
	 private String comicsName;
	 private String comicsUniverse;
	 @OneToMany(mappedBy = "comics",cascade = CascadeType.ALL)
	 private Set<SuperHero> superherolist;
	public int getComicsId() {
		return comicsId;
	}
	public void setComicsId(int comicsId) {
		this.comicsId = comicsId;
	}
	public String getComicsName() {
		return comicsName;
	}
	public void setComicsName(String comicsName) {
		this.comicsName = comicsName;
	}
	public String getComicsUniverse() {
		return comicsUniverse;
	}
	public void setComicsUniverse(String comicsUniverse) {
		this.comicsUniverse = comicsUniverse;
	}
	public Set<SuperHero> getSuperherolist() {
		return superherolist;
	}
	public void setSuperherolist(Set<SuperHero> superherolist) {
		this.superherolist = superherolist;
	}
	@Override
	public String toString() {
		return "Comics [comicsId=" + comicsId + ", comicsName=" + comicsName + ", comicsUniverse=" + comicsUniverse
				+ ", superherolist=" + superherolist + "]";
	}
	public Comics(int comicsId, String comicsName, String comicsUniverse, Set<SuperHero> superherolist) {
		super();
		this.comicsId = comicsId;
		this.comicsName = comicsName;
		this.comicsUniverse = comicsUniverse;
		this.superherolist = superherolist;
	}
	public Comics() {
		super();
		// TODO Auto-generated constructor stub
	}
	 		
	
	
}
