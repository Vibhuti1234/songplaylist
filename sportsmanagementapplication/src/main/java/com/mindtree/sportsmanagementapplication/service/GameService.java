package com.mindtree.sportsmanagementapplication.service;

import java.util.List;

import com.mindtree.sportsmanagementapplication.dto.GameDto;
import com.mindtree.sportsmanagementapplication.entity.Game;
import com.mindtree.sportsmanagementapplication.exception.SportsManagementControllerException;

public interface GameService {

	/**
	 * @param game
	 * @return
	 * adding Game with list of prizes and venue.
	 */
	String addGame(GameDto game);

	/**
	 * @param game
	 * @return
	 * adding Game with list of prizes and venue.
	 * @throws SportsManagementControllerException 
	 */
	String addGame(Game game) throws SportsManagementControllerException;

	List<GameDto> getGamesByVenueName(String venueName) throws SportsManagementControllerException;

	List<GameDto> getGamesByPrizeName(String prizeName) throws SportsManagementControllerException;

}
