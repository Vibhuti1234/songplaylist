package com.mindtree.comicsbookapplication.service.powerserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.comicsbookapplication.repository.ComicsRepository;
import com.mindtree.comicsbookapplication.repository.PowerRepository;
import com.mindtree.comicsbookapplication.repository.SuperheroRepository;
import com.mindtree.comicsbookapplication.service.PowerService;
@Service
public class PowerServiceImpl implements PowerService{
	@Autowired
	ComicsRepository comicsRepository;
	@Autowired
	PowerRepository powerRepository;
	@Autowired
	SuperheroRepository superheroRepository;
}
