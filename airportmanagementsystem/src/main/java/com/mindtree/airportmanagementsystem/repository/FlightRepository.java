package com.mindtree.airportmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.airportmanagementsystem.entity.Flight;
@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer>{

}
