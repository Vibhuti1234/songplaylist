package com.mindtree.sportsmanagementapplication.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="game")
public class Game {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gameId")
	private int gameId;
	@Column(name="gameName",unique=true)
	private String gameName;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="game")
	private List<Prize> prizes;
	@ManyToOne	
	private Venue venue;
		public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Game(int gameId, String gameName, List<Prize> prizes, Venue venue) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.prizes = prizes;
		this.venue = venue;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public List<Prize> getPrizes() {
		return prizes;
	}
	public void setPrizes(List<Prize> prizes) {
		this.prizes = prizes;
	}
	public Venue getVenue() {
		return venue;
	}
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
   	
	
	}
