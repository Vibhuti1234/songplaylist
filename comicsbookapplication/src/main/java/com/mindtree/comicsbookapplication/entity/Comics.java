package com.mindtree.comicsbookapplication.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="comics")
public class Comics {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="comicsId")
    private int comicsId;
	@Column(name="comicsName")
	private String comicsName;
	@Column(name="comicsUniverse")
	private String comicsUniverse;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="comics")
	private Set<Superhero> superheroes;
	public Comics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comics(int comicsId, String comicsName, String comicsUniverse, Set<Superhero> superheroes) {
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
	public Set<Superhero> getSuperheroes() {
		return superheroes;
	}
	public void setSuperheroes(Set<Superhero> superheroes) {
		this.superheroes = superheroes;
	}
	
}
