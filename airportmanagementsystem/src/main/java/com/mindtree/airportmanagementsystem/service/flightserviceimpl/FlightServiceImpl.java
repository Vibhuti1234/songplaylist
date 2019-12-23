package com.mindtree.airportmanagementsystem.service.flightserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.airportmanagementsystem.entity.Airport;
import com.mindtree.airportmanagementsystem.entity.Flight;
import com.mindtree.airportmanagementsystem.exception.AirportManagementControllerException;
import com.mindtree.airportmanagementsystem.exception.NoAirportException;
import com.mindtree.airportmanagementsystem.repository.AirportRepository;
import com.mindtree.airportmanagementsystem.repository.FlightRepository;
import com.mindtree.airportmanagementsystem.repository.PassengerRepository;
import com.mindtree.airportmanagementsystem.service.FlightService;
@Service
public class FlightServiceImpl  implements FlightService{
	@Autowired
	PassengerRepository passengerRepo;
	@Autowired
	AirportRepository airportRepo;
	@Autowired
	FlightRepository flightRepo;
	@Override
	public String addFlight(int airportId, Flight flight) throws AirportManagementControllerException {
		// TODO Auto-generated method stub
		List<Airport> airports=airportRepo.findAll();
		Airport airport=airports.stream().filter(i->i.getAirportId()==airportId).findAny().orElseThrow(()->new NoAirportException("AirportNotfound"));
		flight.setAirport(airport);
		flightRepo.save(flight);
		return "success";
	}
	

}
