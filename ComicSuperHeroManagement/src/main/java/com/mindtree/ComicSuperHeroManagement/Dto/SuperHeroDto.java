package com.mindtree.ComicSuperHeroManagement.Dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.ComicSuperHeroManagement.entity.Comics;
import com.mindtree.ComicSuperHeroManagement.entity.Power;

public class SuperHeroDto {

	private int superHeroId;
	private String superHeroName;
	@JsonIgnoreProperties("superhero")
	List<PowerDto> powerlist;
	@JsonIgnoreProperties("superherolist")
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
	public List<PowerDto> getPowerlist() {
		return powerlist;
	}
	public void setPowerlist(List<PowerDto> powerlist) {
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
		return "SuperHeroDto [superHeroId=" + superHeroId + ", superHeroName=" + superHeroName + ", powerlist="
				+ powerlist + ", comics=" + comics + "]";
	}
	public SuperHeroDto(int superHeroId, String superHeroName, List<PowerDto> powerlist, Comics comics) {
		super();
		this.superHeroId = superHeroId;
		this.superHeroName = superHeroName;
		this.powerlist = powerlist;
		this.comics = comics;
	}
	public SuperHeroDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
