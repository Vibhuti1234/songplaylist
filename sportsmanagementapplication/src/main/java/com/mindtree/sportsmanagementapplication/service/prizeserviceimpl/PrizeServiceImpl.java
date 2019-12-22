package com.mindtree.sportsmanagementapplication.service.prizeserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.sportsmanagementapplication.repository.GameRepository;
import com.mindtree.sportsmanagementapplication.repository.PrizeRepository;
import com.mindtree.sportsmanagementapplication.repository.VenueRepository;
import com.mindtree.sportsmanagementapplication.service.PrizeService;
@Service
public class PrizeServiceImpl implements PrizeService {
	@Autowired
	private VenueRepository venueRepository;
	@Autowired
	private PrizeRepository prizeRepository;
	@Autowired
	private  GameRepository gameRepository;
}
