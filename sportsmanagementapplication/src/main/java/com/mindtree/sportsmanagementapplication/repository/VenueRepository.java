package com.mindtree.sportsmanagementapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.sportsmanagementapplication.entity.Venue;
@Repository
public interface VenueRepository extends JpaRepository<Venue, Integer> {

}
