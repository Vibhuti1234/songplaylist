package com.mindtree.airportmanagementsystem.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AirportDto {
	private int airportId;
	private String airport;
	@JsonIgnore
	private List<FlightDto> flights=new ArrayList<FlightDto>();
	public AirportDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AirportDto(int airportId, String airport, List<FlightDto> flights) {
		super();
		this.airportId = airportId;
		this.airport = airport;
		this.flights = flights;
	}
	public int getAirportId() {
		return airportId;
	}
	public void setAirportId(int airportId) {
		this.airportId = airportId;
	}
	public String getAirport() {
		return airport;
	}
	public void setAirport(String airport) {
		this.airport = airport;
	}
	public List<FlightDto> getFlights() {
		return flights;
	}
	public void setFlights(List<FlightDto> flights) {
		this.flights = flights;
	}
	

}
