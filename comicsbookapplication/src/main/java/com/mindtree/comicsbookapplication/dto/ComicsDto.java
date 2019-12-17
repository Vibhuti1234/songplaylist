package com.mindtree.comicsbookapplication.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mindtree.comicsbookapplication.entity.Superhero;

public class ComicsDto {
	private int comicsId;
	private String comicsName;
	private String comicsUniverse;
	@JsonIgnore
	private Set<SuperheroDto> superheroes;
	public ComicsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ComicsDto(int comicsId, String comicsName, String comicsUniverse, Set<SuperheroDto> superheroes) {
		super();
		this.comicsId = comicsId;
		this.comicsName = comicsName;
		this.comicsUniverse = comicsUniverse;
		this.superheroes = superheroes;
	}
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
	public Set<SuperheroDto> getSuperheroes() {
		return superheroes;
	}
	public void setSuperheroes(Set<SuperheroDto> superheroes) {
		this.superheroes = superheroes;
	}
	

}
