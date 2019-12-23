package com.mindtree.airportmanagementsystem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Airport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int airportId;
	@Column(unique=true)
	private String airport;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="airport")
	private List<Flight> flights=new ArrayList<Flight>();
	public Airport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Airport(int airportId, String airport, List<Flight> flights) {
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
	public List<Flight> getFlights() {
		return flights;
	}
	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	
	
	

}
