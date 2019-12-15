 package com.mindtree.musiccompanyapp.service.artistserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.musiccompanyapp.repository.AlbumRepository;
import com.mindtree.musiccompanyapp.repository.ArtistRepository;
import com.mindtree.musiccompanyapp.repository.SongRepository;
import com.mindtree.musiccompanyapp.service.ArtistService;
@Service
public class ArtistServiceImpl implements ArtistService{
	@Autowired
	SongRepository songRepo;
	@Autowired
	AlbumRepository albumRepo;
	@Autowired
	ArtistRepository artistRepo;
	

}
