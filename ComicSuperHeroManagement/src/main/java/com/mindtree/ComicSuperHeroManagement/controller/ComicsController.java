package com.mindtree.ComicSuperHeroManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.ComicSuperHeroManagement.Dto.ComicDto;
import com.mindtree.ComicSuperHeroManagement.Dto.SuperHeroDto;
import com.mindtree.ComicSuperHeroManagement.exception.ServiceException;
import com.mindtree.ComicSuperHeroManagement.service.ComicService;

@RestController
public class ComicsController {

	@Autowired
	private ComicService comicservice;
	
	@PostMapping("/insertcomics")
	public String insertComics(@RequestBody ComicDto comicsdto)
	{
		
		comicservice.insertcomics(comicsdto);
		
		return "Comics Inserted Successfully";
		}
	
	
	
	
	@GetMapping("/displaysuperheroes")
	public List<SuperHeroDto> getallheroesbypower()
	{
		return comicservice.getHeroes();
			
	}
	@GetMapping("/getdamageofasuperhero/{heroId}")
	public int getdamage(@PathVariable int heroId) throws ServiceException
	{
		return comicservice.getDamagebyHero(heroId);
		
	}
	}
