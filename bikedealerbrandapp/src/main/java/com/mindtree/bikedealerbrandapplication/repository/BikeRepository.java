package com.mindtree.bikedealerbrandapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bikedealerbrandapplication.entity.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer>{

}
