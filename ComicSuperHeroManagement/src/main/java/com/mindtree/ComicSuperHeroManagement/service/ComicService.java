package com.mindtree.ComicSuperHeroManagement.service;

import java.util.List;

import com.mindtree.ComicSuperHeroManagement.Dto.ComicDto;
import com.mindtree.ComicSuperHeroManagement.Dto.SuperHeroDto;
import com.mindtree.ComicSuperHeroManagement.entity.Comics;
import com.mindtree.ComicSuperHeroManagement.exception.ServiceException;

public interface ComicService {

	/**
	 * @param comicsdto
	 * inserts comic details along with the heroes and his powers
	 */
	String insertcomics(ComicDto comicsdto);

	/**
	 * @return
	 * returns list of SuperHeroes whose power is invisibility and flying
	 */
	List<SuperHeroDto> getHeroes();

	/**
	 * @param heroId
	 * @return the damage made by his power
	 * @throws ServiceException 
	 */
	int getDamagebyHero(int heroId) throws ServiceException;


}
