package com.mindtree.sportsmanagementapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="prize")
public class Prize {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="prizeId")
	private int prizeId;
	@Column(name="prizeName")
	private String prizeName;
	@ManyToOne
	private Game game;
	public Prize() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Prize(int prizeId, String prizeName, Game game) {
		super();
		this.prizeId = prizeId;
		this.prizeName = prizeName;
		this.game = game;
	}
	public int getPrizeId() {
		return prizeId;
	}
	public void setPrizeId(int prizeId) {
		this.prizeId = prizeId;
	}
	public String getPrizeName() {
		return prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	
	

}
