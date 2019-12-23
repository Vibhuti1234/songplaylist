package com.mindtree.airportmanagementsystem.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mindtree.airportmanagementsystem.entity.Airport;
import com.mindtree.airportmanagementsystem.entity.Passenger;

public class FlightDto {
	private int flightId;
	private String flightName;
	private double ticketPrice;
	@JsonIgnore
	private Airport airport=new Airport();
	@JsonIgnore
	private List<Passenger> passengers=new ArrayList<Passenger>();
	public FlightDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightDto(int flightId, String flightName, double ticketPrice, Airport airport, List<Passenger> passengers) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.ticketPrice = ticketPrice;
		this.airport = airport;
		this.passengers = passengers;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public Airport getAirport() {
		return airport;
	}
	public void setAirport(Airport airport) {
		this.airport = airport;
	}
	public List<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	
}
