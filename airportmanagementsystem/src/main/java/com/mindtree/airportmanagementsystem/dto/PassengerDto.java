package com.mindtree.airportmanagementsystem.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PassengerDto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int passengerId;
	private String passengerName;
	private int age;
	private double ticketCost;
	@JsonIgnore
	private FlightDto flight=new FlightDto();
	public PassengerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PassengerDto(int passengerId, String passengerName, int age, double ticketCost, FlightDto flight) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.age = age;
		this.ticketCost = ticketCost;
		this.flight = flight;
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}
	public FlightDto getFlight() {
		return flight;
	}
	public void setFlight(FlightDto flight) {
		this.flight = flight;
	}
	
	

}
