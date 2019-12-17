package com.mindtree.comicsbookapplication.service.comicsserviceimpl;

import java.util.List;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.comicsbookapplication.dto.ComicsDto;
import com.mindtree.comicsbookapplication.entity.Comics;
import com.mindtree.comicsbookapplication.entity.Power;
import com.mindtree.comicsbookapplication.entity.Superhero;
import com.mindtree.comicsbookapplication.repository.ComicsRepository;
import com.mindtree.comicsbookapplication.repository.PowerRepository;
import com.mindtree.comicsbookapplication.repository.SuperheroRepository;
import com.mindtree.comicsbookapplication.service.ComicsService;

@Service
public class ComicsServiceImpl  implements ComicsService{
	@Autowired
	ComicsRepository comicsRepository;
	@Autowired
	PowerRepository powerRepository;
	@Autowired
	SuperheroRepository superheroRepository;
	ModelMapper modelMapper=new ModelMapper();
	@Override
	public String addComics(ComicsDto comics) {
	
		Comics comicsEntity = convertDtoToEntity(comics);
		
		Set<Superhero> superheroes=comicsEntity.getSuperheroes();
	for (Superhero superhero : superheroes) {
		superhero.setComics(comicsEntity);
	}
		for (Superhero superhero : superheroes) {
			List<Power> powers=superhero.getPowers();
			for (Power power : powers) {
				power.setSuperhero(superhero);
				
			}
			
		}
		
		comicsRepository.save(comicsEntity);
		for (Superhero superhero : superheroes) {
			superheroRepository.save(superhero);
			
		}
		for (Superhero superhero : superheroes) {
			List<Power> powers=superhero.getPowers();
			for (Power power : powers) {
				powerRepository.save(power);
				
			}
		}
		return "Success";
	}
	private Comics convertDtoToEntity(ComicsDto comics) {
		// TODO Auto-generated method stub
		return modelMapper.map(comics, Comics.class);
	}
	@Override
	public String addComic(Comics comicsEntity) {
		// TODO Auto-generated method stub
		Set<Superhero> superheroes=comicsEntity.getSuperheroes();
		for (Superhero superhero : superheroes) {
			superhero.setComics(comicsEntity);
		}
			for (Superhero superhero : superheroes) {
				List<Power> powers=superhero.getPowers();
				for (Power power : powers) {
					power.setSuperhero(superhero);
					
				}
				
			}
			
			comicsRepository.save(comicsEntity);
			for (Superhero superhero : superheroes) {
				superheroRepository.save(superhero);
				
			}
			for (Superhero superhero : superheroes) {
				List<Power> powers=superhero.getPowers();
				for (Power power : powers) {
					powerRepository.save(power);
					
				}
			}
			return "Success";
	}

}
