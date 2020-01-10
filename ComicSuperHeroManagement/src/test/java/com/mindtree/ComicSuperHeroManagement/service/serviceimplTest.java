/**
 * 
 */
package com.mindtree.ComicSuperHeroManagement.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.mindtree.ComicSuperHeroManagement.Dto.ComicDto;
import com.mindtree.ComicSuperHeroManagement.Dto.PowerDto;
import com.mindtree.ComicSuperHeroManagement.Dto.SuperHeroDto;
import com.mindtree.ComicSuperHeroManagement.entity.Comics;
import com.mindtree.ComicSuperHeroManagement.entity.Power;
import com.mindtree.ComicSuperHeroManagement.entity.SuperHero;
import com.mindtree.ComicSuperHeroManagement.exception.ServiceException;
import com.mindtree.ComicSuperHeroManagement.repository.ComicsRepository;
import com.mindtree.ComicSuperHeroManagement.repository.PowerRepository;
import com.mindtree.ComicSuperHeroManagement.repository.SuperHeroRepository;
import com.mindtree.ComicSuperHeroManagement.service.impl.ComicServiceImpl;

@RunWith(MockitoJUnitRunner.Silent.class) 
@WebMvcTest(ComicServiceImpl.class)
/**
 * @author M1056081
 *
 */
public class serviceimplTest
{
	ModelMapper model=new ModelMapper();
	@InjectMocks
	ComicServiceImpl comicserviceimpl;
	
	@Mock
	ComicsRepository comicrepository;
	
	@Mock
	SuperHeroRepository superherorepository;
	
	@Mock
	PowerRepository powerrepository;
	
	@Autowired
	MockMvc mockmvc;
	
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		MockitoAnnotations.initMocks(this);
		mockmvc=MockMvcBuilders.standaloneSetup(comicserviceimpl).build();
		
	}

	/**
	 * Test method for {@link com.mindtree.ComicSuperHeroManagement.service.impl.ComicServiceImpl#insertcomics(com.mindtree.ComicSuperHeroManagement.Dto.ComicDto)}.
	 */
	@Test
	public void testInsertcomics() 
	{
		Set<SuperHeroDto> superherodtolist=new HashSet<SuperHeroDto>();
		List<PowerDto> powerlistdto=new ArrayList<PowerDto>();
		powerlistdto.add(new PowerDto(1,"flying",5,null));
		powerlistdto.add(new PowerDto(2,"freezing",6,null));
		powerlistdto.add(new PowerDto(3,"fire",7,null));
		superherodtolist.add(new SuperHeroDto(1,"Srajit",powerlistdto,null));
		
		Set<SuperHero> superherolist = superherodtolist.stream().map(i->model.map(i,SuperHero.class)).collect(Collectors.toSet());
		Comics comic=new Comics(1,"Game of Thrones","Earth", superherolist);
		ComicDto comicsdto=new ComicDto(1,"Game of Thrones","Earth",superherodtolist);
		when(comicrepository.saveAndFlush(comic)).thenReturn(comic);
		assertEquals(comicserviceimpl.insertcomics(comicsdto), "Comic inserted successfully");
		
		
	}

	/**
	 * Test method for {@link com.mindtree.ComicSuperHeroManagement.service.impl.ComicServiceImpl#getHeroes()}.
	 */
	@Test
	public void testGetHeroes()
	{
		List<Power> listpower1=new ArrayList<Power>();
		List<Power> listpower2=new ArrayList<Power>();
		Power power1=new Power(1,"flying",5,null);
		Power power2=new Power(2,"fire",5,null);
		Power power3=new Power(3,"freezing",5,null);
		listpower1.add(power1);
		listpower1.add(power3);
		
	
		listpower2.add(power1);
		listpower2.add(power2);
		
		SuperHero superhero1=new SuperHero(1,"Antman",listpower1,null);
		SuperHero superhero2=new SuperHero(2,"SpiderMan",listpower2,null);
		List<SuperHero> listsuper=new ArrayList<SuperHero>();
		listsuper.add(superhero1);
		listsuper.add(superhero2);
			when(superherorepository.findAll()).thenReturn(listsuper);
			assertEquals(comicserviceimpl.getHeroes().size(),1);
			assertNotEquals(comicserviceimpl.getHeroes().size(),2);
	}

	/**
	 * Test method for {@link com.mindtree.ComicSuperHeroManagement.service.impl.ComicServiceImpl#getDamagebyHero(int)}.
	 * @throws ServiceException 
	 */
	
	@Test
	public void testGetDamagebyHero() throws ServiceException
	{
	Power power1=new Power(1,"flying",4,null);
	Power power2=new Power(2,"freeezing",5,null);
	List<Power>powerlist=new ArrayList<Power>();
	
	powerlist.add(power1);
	powerlist.add(power2);
	SuperHero superhero=new SuperHero(3,"Srajit",powerlist,null);
	when(superherorepository.existsById(3)).thenReturn(true);
	when(superherorepository.getOne(superhero.getSuperHeroId())).thenReturn(superhero);
	assertEquals(comicserviceimpl.getDamagebyHero(3),9);
	
	}
	

}
