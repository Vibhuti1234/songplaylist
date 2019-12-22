package com.mindtree.sportsmanagementapplication.dto;

public class PrizeDto {
	private int prizeId;
	private String prizeName;
	private GameDto game;
	public PrizeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PrizeDto(int prizeId, String prizeName, GameDto game) {
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
	public GameDto getGame() {
		return game;
	}
	public void setGame(GameDto game) {
		this.game = game;
	}
	
}
