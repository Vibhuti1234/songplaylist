package com.mindtree.airportmanagementsystem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int flightId;
	private String flightName;
	private double ticketPrice;
	@ManyToOne
	private Airport airport=new Airport();
	@OneToMany(cascade=CascadeType.ALL,mappedBy="flight")
	private List<Passenger> passengers=new ArrayList<Passenger>();
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(int flightId, String flightName, double ticketPrice, Airport airport, List<Passenger> passengers) {
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
