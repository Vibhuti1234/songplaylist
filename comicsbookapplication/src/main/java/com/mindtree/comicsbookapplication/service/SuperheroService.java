package com.mindtree.comicsbookapplication.service;

import java.util.List;
import java.util.Set;

import com.mindtree.comicsbookapplication.dto.SuperheroDto;
import com.mindtree.comicsbookapplication.exception.ComicsBookControllerException;
import com.mindtree.comicsbookapplication.exception.NoSuperHeroPresentException;

public interface SuperheroService {

	List<SuperheroDto> displaySuperheroByPower() throws ComicsBookControllerException ;

	int findTotalDamageById(int superheroId) throws ComicsBookControllerException;

}
