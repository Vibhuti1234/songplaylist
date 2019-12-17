package com.mindtree.comicsbookapplication.service.superheroserviceimpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.comicsbookapplication.dto.SuperheroDto;
import com.mindtree.comicsbookapplication.entity.Power;
import com.mindtree.comicsbookapplication.entity.Superhero;
import com.mindtree.comicsbookapplication.exception.ComicsBookControllerException;
import com.mindtree.comicsbookapplication.exception.NoSuchSuperHeroPresentException;
import com.mindtree.comicsbookapplication.exception.NoSuperHeroPresentException;
import com.mindtree.comicsbookapplication.repository.ComicsRepository;
import com.mindtree.comicsbookapplication.repository.PowerRepository;
import com.mindtree.comicsbookapplication.repository.SuperheroRepository;
import com.mindtree.comicsbookapplication.service.SuperheroService;

@Service
public class SuperheroServiceImpl  implements SuperheroService{
	@Autowired
	ComicsRepository comicsRepository;
	@Autowired
	PowerRepository powerRepository;
	@Autowired
	SuperheroRepository superheroRepository;
	ModelMapper modelMapper=new ModelMapper();
	@Override
	public List<SuperheroDto> displaySuperheroByPower() throws ComicsBookControllerException {
		// TODO Auto-generated method stub
		int count =0;
		List<Superhero> superheroes= superheroRepository.findAll();
		if(superheroes.size()==0)
		{
			throw new NoSuperHeroPresentException("No Superhero Present");
		}
		List<Superhero>  superheroList=new ArrayList<Superhero>();

		for (Superhero superhero : superheroes) {
			List<Power> powers=superhero.getPowers();
			Set<Power> powerSet=new HashSet<Power>(powers);
			for(Power powerset : powerSet) {
				if(powerset.getPowerName().equals("invisibility")||powerset.getPowerName().equals("flying"))
				{
					count++;
					
				}
				if(count>=2)
				{
					superheroList.add(superhero);
				}
				count=0;
				
			}
		

		}
		if(superheroList.size()==0)
		{
			throw new NoSuchSuperHeroPresentException("No Such Super Hero Present");
		}
	 List<SuperheroDto> superheroDtos = superheroList.stream().map(entity -> convertEntityToDto(entity))
				.collect(Collectors.toList());
	 return superheroDtos;
	}
	private SuperheroDto convertEntityToDto(Superhero entity) {
		// TODO Auto-generated method stub
		return modelMapper.map(entity, SuperheroDto.class);
	}
	@Override
	public int findTotalDamageById(int superheroId) throws ComicsBookControllerException {
		// TODO Auto-generated method stub
		List<Superhero> superheroes=superheroRepository.findAll();
		if(superheroes.size()==0)
		{
			throw new NoSuperHeroPresentException("No Superhero Present");
		}
		
		Superhero superhero=superheroes.stream().filter(i->i.getSuperheroId()==superheroId).findAny().orElseThrow(()->new NoSuchSuperHeroPresentException("No Such Superhero With This Id"));
        int sum=superhero.getPowers().stream().reduce(0,(a,b)->a+b.getPowerDamage(),Integer::sum);

		return sum;
	}
}
