package com.mindtree.comicsbookapplication.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name="superhero")
public class Superhero {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="superheroId")
	private int superheroId;
	@Column(name="superheroName")
	private String superheroName;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="superhero")
	private List<Power> powers;
    @ManyToOne
    private Comics comics;
	public Superhero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Superhero(int superheroId, String superheroName, List<Power> powers, Comics comics) {
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
	public List<Power> getPowers() {
		return powers;
	}
	public void setPowers(List<Power> powers) {
		this.powers = powers;
	}
	public Comics getComics() {
		return comics;
	}
	public void setComics(Comics comics) {
		this.comics = comics;
	}
    
    
}
