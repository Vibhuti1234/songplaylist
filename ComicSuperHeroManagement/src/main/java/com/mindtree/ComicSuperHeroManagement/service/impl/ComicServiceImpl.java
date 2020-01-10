package com.mindtree.ComicSuperHeroManagement.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.ss.formula.constant.ErrorConstant;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ComicSuperHeroManagement.Dto.ComicDto;
import com.mindtree.ComicSuperHeroManagement.Dto.SuperHeroDto;
import com.mindtree.ComicSuperHeroManagement.entity.Comics;
import com.mindtree.ComicSuperHeroManagement.entity.Power;
import com.mindtree.ComicSuperHeroManagement.entity.SuperHero;
import com.mindtree.ComicSuperHeroManagement.exception.ErrorConst;
import com.mindtree.ComicSuperHeroManagement.exception.NoSuchHeroIdFoundException;
import com.mindtree.ComicSuperHeroManagement.exception.ServiceException;
import com.mindtree.ComicSuperHeroManagement.repository.ComicsRepository;
import com.mindtree.ComicSuperHeroManagement.repository.PowerRepository;
import com.mindtree.ComicSuperHeroManagement.repository.SuperHeroRepository;
import com.mindtree.ComicSuperHeroManagement.service.ComicService;

@Service
public class ComicServiceImpl implements ComicService {

	@Autowired
	ComicsRepository comicsrepository;
	@Autowired
	PowerRepository powerrepository;
	@Autowired
	SuperHeroRepository superherorepository;

	ModelMapper model = new ModelMapper();

	Comics changeDtoTOEntity(ComicDto comicDto) {
		return model.map(comicDto, Comics.class);
	}

	SuperHeroDto changeentityToDto(SuperHero hero) {
		return model.map(hero, SuperHeroDto.class);
	}

	@Override
	public String insertcomics(ComicDto comicsdto) {
		// TODO Auto-generated method stub
		

		Comics comics = changeDtoTOEntity(comicsdto);

		comics.getSuperherolist().forEach(hero -> hero.setComics(comics));

		comics.getSuperherolist().forEach(hero -> hero.getPowerlist().forEach(power -> power.setSuperhero(hero)));
System.out.println(comicsrepository.varComic());
		comicsrepository.saveAndFlush(comics);
		return "Comic inserted successfully";
	}
	
	
	

	@Override
	public List<SuperHeroDto> getHeroes() {
		List<SuperHero> superherolist = superherorepository.findAll();
		List<SuperHero> templist = new ArrayList<SuperHero>();

		List<SuperHeroDto> superherodtolist;
		for (SuperHero hero : superherolist) {
			for (Power power : hero.getPowerlist()) {
				if (power.getPowerName().equalsIgnoreCase("flying")) {
					for (Power power1 : hero.getPowerlist()) {
						if (power1.getPowerName().equalsIgnoreCase("freezing")) {
							templist.add(hero);
						}
					}
				}
			}
		}

		superherodtolist = templist.stream().map(hero -> changeentityToDto(hero)).collect(Collectors.toList());

		return superherodtolist;

	}

	@Override
	public int getDamagebyHero(int heroId) throws ServiceException {
		if (superherorepository.existsById(heroId)) {
			int sum = 0;
			SuperHero superhero = superherorepository.getOne(heroId);
			for (Power power : superhero.getPowerlist()) {
				sum = sum + power.getPowerDamage();

			}
			return sum;
		} 
		else
				throw new NoSuchHeroIdFoundException(ErrorConst.NosuchHeroId);
			}

	}

