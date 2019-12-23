package com.mindtree.airportmanagementsystem.service;

import com.mindtree.airportmanagementsystem.entity.Airport;
import com.mindtree.airportmanagementsystem.entity.Flight;
import com.mindtree.airportmanagementsystem.exception.AirportManagementControllerException;

public interface FlightService {

	String addFlight(int airportId, Flight flight) throws AirportManagementControllerException;

}
