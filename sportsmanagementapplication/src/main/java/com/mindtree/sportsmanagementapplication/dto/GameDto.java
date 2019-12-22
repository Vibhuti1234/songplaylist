package com.mindtree.sportsmanagementapplication.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class GameDto {
	private int gameId;
	private String gameName;
	@JsonIgnore
	private List<PrizeDto> prizes;
	private VenueDto venue;
	public GameDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GameDto(int gameId, String gameName, List<PrizeDto> prizes, VenueDto venue) {
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
	public List<PrizeDto> getPrizes() {
		return prizes;
	}
	public void setPrizes(List<PrizeDto> prizes) {
		this.prizes = prizes;
	}
	public VenueDto getVenue() {
		return venue;
	}
	public void setVenue(VenueDto venue) {
		this.venue = venue;
	}
		

}
