package com.mindtree.musiccompanyapp.service.albumserviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.musiccompanyapp.dto.AlbumDto;
import com.mindtree.musiccompanyapp.entity.Album;
import com.mindtree.musiccompanyapp.entity.Artist;
import com.mindtree.musiccompanyapp.entity.Song;
import com.mindtree.musiccompanyapp.exception.ArtistAlreadyPresentException;
import com.mindtree.musiccompanyapp.exception.MusicCompanyAppControllerException;
import com.mindtree.musiccompanyapp.exception.SongAlreadyThere;
import com.mindtree.musiccompanyapp.repository.AlbumRepository;
import com.mindtree.musiccompanyapp.repository.ArtistRepository;
import com.mindtree.musiccompanyapp.repository.SongRepository;
import com.mindtree.musiccompanyapp.service.AlbumService;
@Service
public class AlbumServiceImpl implements AlbumService {
	@Autowired
	SongRepository songRepo;
	@Autowired
	AlbumRepository albumRepo;
	@Autowired
	ArtistRepository artistRepo;
	ModelMapper modelMapper=new ModelMapper();
	/*public Album addAlbum(Album album) {
	   List<Song> songs =album.getSongs();
	   for (Song song : songs) {
		   song.setAlbum(album);
		   Artist artist=song.getArtist();
		   
		   
	}*/
	
	public List<Album> getAlbum() {
		// TODO Auto-generated method stub
		return albumRepo.findAll();
	}
	public String addAlbum(AlbumDto album) throws MusicCompanyAppControllerException {
		return null;
		// TODO Auto-generated method stub
	}
	private Album convertDtoToEntity(AlbumDto album) {
		// TODO Auto-generated method stub
		return modelMapper.map(album,Album.class);
	}
}
