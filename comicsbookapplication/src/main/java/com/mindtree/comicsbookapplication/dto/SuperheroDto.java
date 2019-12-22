package com.mindtree.comicsbookapplication.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mindtree.comicsbookapplication.entity.Comics;
import com.mindtree.comicsbookapplication.entity.Power;

public class SuperheroDto {
	private int superheroId;
	private String superheroName;
	@JsonIgnore
	private List<PowerDto> powers =new ArrayList<PowerDto>();
    private ComicsDto comics=new ComicsDto();
	public SuperheroDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SuperheroDto(int superheroId, String superheroName, List<PowerDto> powers, ComicsDto comics) {
		super();
		this.superheroId = superheroId;
		this.superheroName = superheroName;
		this.powers = powers;
		this.comics = comics;
	}
	public int getSuperheroId() {
		return superheroId;
	}
	public void setSuperheroId(int superheroId) {
		this.superheroId = superheroId;
	}
	public String getSuperheroName() {
		return superheroName;
	}
	public void setSuperheroName(String superheroName) {
		this.superheroName = superheroName;
	}
	public List<PowerDto> getPowers() {
		return powers;
	}
	public void setPowers(List<PowerDto> powers) {
		this.powers = powers;
	}
	public ComicsDto getComics() {
		return comics;
	}
	public void setComics(ComicsDto comics) {
		this.comics = comics;
	}

}
