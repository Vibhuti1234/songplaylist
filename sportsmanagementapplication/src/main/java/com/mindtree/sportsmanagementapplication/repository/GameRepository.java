package com.mindtree.sportsmanagementapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.sportsmanagementapplication.entity.Game;
@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

}
