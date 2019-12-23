package com.mindtree.channelmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.channelmanagementsystem.entity.Shows;

public interface ShowRepository extends JpaRepository<Shows, Integer> {

}
