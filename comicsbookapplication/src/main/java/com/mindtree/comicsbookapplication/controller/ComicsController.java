package com.mindtree.comicsbookapplication.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.comicsbookapplication.dto.ComicsDto;
import com.mindtree.comicsbookapplication.dto.SuperheroDto;
import com.mindtree.comicsbookapplication.entity.Comics;
import com.mindtree.comicsbookapplication.exception.ComicsBookControllerException;
import com.mindtree.comicsbookapplication.exception.NoSuperHeroPresentException;
import com.mindtree.comicsbookapplication.service.ComicsService;
import com.mindtree.comicsbookapplication.service.SuperheroService;

@RestController
public class ComicsController {
	@Autowired
	ComicsService comicsService;
	@Autowired
	SuperheroService superheroService;
	@PostMapping("/addComics")
	public String addComics(@RequestBody ComicsDto comics)
	{
		return comicsService.addComics(comics);
	}
  @PostMapping("/addComic")
  public String addComic(@RequestBody Comics comics)
  {
	  return comicsService.addComic(comics);
  }
  @GetMapping("/displaySuperheroByPower")
  public List<SuperheroDto> displaySuperheroByPower() throws ComicsBookControllerException
  {
	return superheroService.displaySuperheroByPower();  
  }
  @GetMapping("/findTotalDamageById/{superheroId}")
  public int findTotalDamageById(@PathVariable int superheroId ) throws ComicsBookControllerException
  {
	  return superheroService.findTotalDamageById(superheroId);
  }
}
