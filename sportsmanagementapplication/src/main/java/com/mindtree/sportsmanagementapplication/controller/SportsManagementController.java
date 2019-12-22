package com.mindtree.sportsmanagementapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.sportsmanagementapplication.dto.GameDto;
import com.mindtree.sportsmanagementapplication.entity.Game;
import com.mindtree.sportsmanagementapplication.exception.SportsManagementControllerException;
import com.mindtree.sportsmanagementapplication.service.GameService;
import com.mindtree.sportsmanagementapplication.service.PrizeService;
import com.mindtree.sportsmanagementapplication.service.VenueService;

@RestController
public class SportsManagementController {
@Autowired
private VenueService venueService;
@Autowired
private GameService gameService;
@Autowired
private PrizeService prizeservice;
@PostMapping(value="/addGames")
public String addGames(@RequestBody GameDto game)
{ 
 return gameService.addGame(game);	
}
@PostMapping(value="/addGame")
public String addGame(@RequestBody Game game) throws SportsManagementControllerException
{
	return gameService.addGame(game);
}
@GetMapping(value="/getGamesByVenueName/{venueName}")
public List<GameDto> getGamesByVenueName(@PathVariable String venueName) throws SportsManagementControllerException
{
	return gameService.getGamesByVenueName(venueName);
}
@GetMapping(value="/getGamesByPrizeName/{prizeName}")
public List<GameDto> getGamesByPrizeName(@PathVariable String prizeName ) throws SportsManagementControllerException
{
	return gameService.getGamesByPrizeName(prizeName);
}
}
