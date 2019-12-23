package com.mindtree.airportmanagementsystem.service.airportserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.airportmanagementsystem.entity.Airport;
import com.mindtree.airportmanagementsystem.repository.AirportRepository;
import com.mindtree.airportmanagementsystem.repository.FlightRepository;
import com.mindtree.airportmanagementsystem.repository.PassengerRepository;
import com.mindtree.airportmanagementsystem.service.AirportService;
@Service
public class AirportServiceImpl implements AirportService {
	@Autowired
	PassengerRepository passengerRepo;
	@Autowired
	AirportRepository airportRepo;
	@Autowired
	FlightRepository flightRepo;
	@Override
	public String addAirport(Airport airport) {
		// TODO Auto-generated method stub
		airportRepo.save(airport);
		return null;
	}
	

}
