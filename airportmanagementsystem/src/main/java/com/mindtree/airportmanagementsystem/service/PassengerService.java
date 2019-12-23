package com.mindtree.airportmanagementsystem.service;

import java.util.List;

import com.mindtree.airportmanagementsystem.dto.PassengerDto;
import com.mindtree.airportmanagementsystem.entity.Passenger;
import com.mindtree.airportmanagementsystem.exception.AirportManagementControllerException;

public interface PassengerService {

	String addPassenger(int flightId, Passenger passenger) throws AirportManagementControllerException;

	List<PassengerDto> getPassengers();

}
