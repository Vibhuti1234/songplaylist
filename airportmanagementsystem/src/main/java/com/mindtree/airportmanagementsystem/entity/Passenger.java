package com.mindtree.airportmanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Passenger implements Comparable<Object> {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int passengerId;
	private String passengerName;
	private int age;
	private double ticketCost;
	@ManyToOne
	private Flight flight=new Flight();
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(int passengerId, String passengerName, int age, double ticketCost, Flight flight) {
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
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Passenger e = (Passenger) o;
		int iAgeComaprison = Integer.compare(this.age, e.age);
		int iTicketComparison=Double.compare(this.ticketCost,e.ticketCost);
		int iNameComparison=passengerName.compareTo(e.passengerName);
		if (iAgeComaprison!= 0)// Salaries are equal use name as comparison criteria
		{
			//  name comparison with rhs name
			return iAgeComaprison;
		}
		else if(iAgeComaprison==0 && iTicketComparison!=0)
		{// Now if salaries are not equal, return comparison of salries
		return iTicketComparison;
		}
		else {
			return iNameComparison;
		}
		
	}
	

}
