package com.mindtree.airportmanagementsystem.service.passengerserviceimpl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.airportmanagementsystem.dto.PassengerDto;
import com.mindtree.airportmanagementsystem.entity.Flight;
import com.mindtree.airportmanagementsystem.entity.Passenger;
import com.mindtree.airportmanagementsystem.exception.AirportManagementControllerException;
import com.mindtree.airportmanagementsystem.exception.NoFlightFoundException;
import com.mindtree.airportmanagementsystem.repository.AirportRepository;
import com.mindtree.airportmanagementsystem.repository.FlightRepository;
import com.mindtree.airportmanagementsystem.repository.PassengerRepository;
import com.mindtree.airportmanagementsystem.service.PassengerService;
@Service
public class PassengerServiceImpl implements PassengerService{
	@Autowired
	PassengerRepository passengerRepo;
	@Autowired
	AirportRepository airportRepo;
	@Autowired
	FlightRepository flightRepo;
	ModelMapper modelMapper=new ModelMapper();
	@Override
	public String addPassenger(int flightId, Passenger passenger) throws AirportManagementControllerException {
		// TODO Auto-generated method stub
		List<Flight> flights=flightRepo.findAll();
		Flight flight=flights.stream().filter(i->i.getFlightId()==flightId).findAny().orElseThrow(()->new NoFlightFoundException("No Flight Found"));
		
		passenger.setFlight(flight);
		if(passenger.getAge()>60)
		{
		 double ticketCost=passenger.getTicketCost()-(2*passenger.getTicketCost())/10;
		 passenger.setTicketCost(ticketCost);
		}
		passengerRepo.save(passenger);
		return "success";
	}
	@Override
	public List<PassengerDto> getPassengers() {
		// TODO Auto-generated method stub
		List<Passenger> passengers=passengerRepo.findAll();
		Collections.sort(passengers);
		List<PassengerDto> passengerDtos=passengers.stream().map(i->convertEntityToDto(i)).collect(Collectors.toList());
		return passengerDtos;
	}
	private PassengerDto convertEntityToDto(Passenger i) {
		// TODO Auto-generated method stub
		return modelMapper.map(i,PassengerDto.class);
	}
	

}
