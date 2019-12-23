package com.mindtree.airportmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.airportmanagementsystem.entity.Airport;
@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer>{

}
