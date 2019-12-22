package com.mindtree.sportsmanagementapplication.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="venue")
public class Venue {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="venueId")
	private int venueId;
	@Column(name="venueName")
	private String venueName;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="venue")
	private List<Game> games;
	public Venue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Venue(int venueId, String venueName, List<Game> games) {
		super();
		this.venueId = venueId;
		this.venueName = venueName;
		this.games = games;
	}
	public int getVenueId() {
		return venueId;
	}
	public void setVenueId(int venueId) {
		this.venueId = venueId;
	}
	public String getVenueName() {
		return venueName;
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}
	
	
	

}
