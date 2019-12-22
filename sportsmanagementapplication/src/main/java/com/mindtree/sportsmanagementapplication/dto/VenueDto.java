package com.mindtree.sportsmanagementapplication.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class VenueDto {
	private int venueId;
	private String venueName;
	@JsonIgnore
	private List<GameDto> games;
	public VenueDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VenueDto(int venueId, String venueName, List<GameDto> games) {
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
	public List<GameDto> getGames() {
		return games;
	}
	public void setGames(List<GameDto> games) {
		this.games = games;
	}
	

}
