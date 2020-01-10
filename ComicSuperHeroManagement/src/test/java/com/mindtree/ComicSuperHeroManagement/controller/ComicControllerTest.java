	package com.mindtree.ComicSuperHeroManagement.controller;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.mindtree.ComicSuperHeroManagement.Dto.ComicDto;
import com.mindtree.ComicSuperHeroManagement.Dto.SuperHeroDto;
import com.mindtree.ComicSuperHeroManagement.entity.Power;
import com.mindtree.ComicSuperHeroManagement.entity.SuperHero;
import com.mindtree.ComicSuperHeroManagement.exception.ServiceException;
import com.mindtree.ComicSuperHeroManagement.service.ComicService;

@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(ComicsController.class)
public class ComicControllerTest {

	@InjectMocks
	private ComicsController comicscontroller;

	@Mock
	private ComicService comicservice;

	@Autowired
	private MockMvc mockmvc;

	ModelMapper model = new ModelMapper();

	SuperHeroDto convertentitytodto(SuperHero hero) {
		return model.map(hero, SuperHeroDto.class);
	}

	@Before
	public void setUp() throws Exception {

		MockitoAnnotations.initMocks(this);
		mockmvc = MockMvcBuilders.standaloneSetup(comicscontroller).build();

	}
	
	@Test
	public void testInsertComics() 
	{
	
		ComicDto comicdto1=new ComicDto(1,"Batman Origins","Earth",null);
		Mockito.when(comicservice.insertcomics(comicdto1)).thenReturn("Comic inserted successfully");
		assertEquals(comicscontroller.insertComics(comicdto1), "Comics Inserted Successfully");
	}
	
	
	
	@Test
	public void testGetallheroesbypower() 
	{

			List<SuperHeroDto> superherodtolist=new ArrayList<SuperHeroDto>();
			SuperHeroDto superhero1=	new SuperHeroDto(1,"Spiderman",null,null);
			SuperHeroDto superhero2= new SuperHeroDto(2,"Antman",null,null);
			superherodtolist.add(superhero1);		
			superherodtolist.add(superhero2);
			
			Mockito.when(comicservice.getHeroes()).thenReturn(superherodtolist);
			assertEquals(comicscontroller.getallheroesbypower(), superherodtolist);
			
			}	

	@Test
	public void testGetdamage() throws ServiceException
	{
		
		int damage=9;
		Mockito.when(comicservice.getDamagebyHero(3)).thenReturn(damage);
		assertEquals(comicscontroller.getdamage(3), 9);
	}

}
