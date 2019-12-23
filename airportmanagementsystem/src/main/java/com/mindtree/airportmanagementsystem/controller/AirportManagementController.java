package com.mindtree.airportmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.airportmanagementsystem.dto.PassengerDto;
import com.mindtree.airportmanagementsystem.entity.Airport;
import com.mindtree.airportmanagementsystem.entity.Flight;
import com.mindtree.airportmanagementsystem.entity.Passenger;
import com.mindtree.airportmanagementsystem.exception.AirportManagementControllerException;
import com.mindtree.airportmanagementsystem.service.AirportService;
import com.mindtree.airportmanagementsystem.service.FlightService;
import com.mindtree.airportmanagementsystem.service.PassengerService;

@RestController
public class AirportManagementController {
	@Autowired
	AirportService airportService;
	@Autowired
	FlightService flightService;
	@Autowired
	PassengerService passengerService;
	@PostMapping("/addAirport")
	public String addAirport(@RequestBody Airport airport)
	{
		return airportService.addAirport(airport);
	}
	@PostMapping("/addFlight/{airportId}")
	public String addFlight(@PathVariable int airportId,@RequestBody Flight flight) throws AirportManagementControllerException
	{
		return flightService.addFlight(airportId,flight);
	}
	@PostMapping("/addPassenger/{flightId}")
	public String addPassenger(@PathVariable int flightId,@RequestBody Passenger passenger ) throws AirportManagementControllerException
	{
		return passengerService.addPassenger(flightId,passenger);
	}
	@GetMapping("/displayPassenger")
	public List<PassengerDto> getPassengers()
	{return passengerService.getPassengers();
		
	}

}
