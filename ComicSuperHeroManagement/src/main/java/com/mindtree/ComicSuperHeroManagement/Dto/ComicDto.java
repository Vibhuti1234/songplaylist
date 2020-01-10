package com.mindtree.ComicSuperHeroManagement.Dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.ComicSuperHeroManagement.entity.SuperHero;

public class ComicDto {

	private int comicsId;
	 private String comicsName;
	 private String comicsUniverse;
	 @JsonIgnoreProperties("comics")
	 private Set<SuperHeroDto> superherolist;
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
	public Set<SuperHeroDto> getSuperherolist() {
		return superherolist;
	}
	public void setSuperherolist(Set<SuperHeroDto> superherolist) {
		this.superherolist = superherolist;
	}
	@Override
	public String toString() {
		return "ComicDto [comicsId=" + comicsId + ", comicsName=" + comicsName + ", comicsUniverse=" + comicsUniverse
				+ ", superherolist=" + superherolist + "]";
	}
	public ComicDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ComicDto(int comicsId, String comicsName, String comicsUniverse, Set<SuperHeroDto> superherolist) {
		super();
		this.comicsId = comicsId;
		this.comicsName = comicsName;
		this.comicsUniverse = comicsUniverse;
		this.superherolist = superherolist;
	}
	 
	
	
}
