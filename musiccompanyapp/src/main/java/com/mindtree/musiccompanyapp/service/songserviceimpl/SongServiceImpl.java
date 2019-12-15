package com.mindtree.musiccompanyapp.service.songserviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Service;

import com.mindtree.musiccompanyapp.dto.SongDto;
import com.mindtree.musiccompanyapp.entity.Album;
import com.mindtree.musiccompanyapp.entity.Artist;
import com.mindtree.musiccompanyapp.entity.Song;
import com.mindtree.musiccompanyapp.exception.MusicCompanyAppControllerException;
import com.mindtree.musiccompanyapp.exception.NoAlbumFoundException;
import com.mindtree.musiccompanyapp.exception.NoSongsFoundException;
import com.mindtree.musiccompanyapp.exception.NoSuchSongIsFoundException;
import com.mindtree.musiccompanyapp.repository.AlbumRepository;
import com.mindtree.musiccompanyapp.repository.ArtistRepository;
import com.mindtree.musiccompanyapp.repository.SongRepository;
import com.mindtree.musiccompanyapp.service.SongService;
@Service
public class SongServiceImpl implements SongService {
	@Autowired
	SongRepository songRepo;
	@Autowired
	AlbumRepository albumRepo;
	@Autowired
	ArtistRepository artistRepo;
	ModelMapper modelMapper=new ModelMapper();
	/*public String addSong(SongDto song) {
		// TODO Auto-generated method stub
		Album album=song.getAlbum();
	    albumRepo.saveAndFlush(album);
	    Artist artist=song.getArtist();
	    artistRepo.saveAndFlush(artist);
	    songRepo.saveAndFlush(song);
		return "Success";
		
	}*/
	public String addSong(SongDto song) {
		// TODO Auto-generated method stub
		int c=0;
		int k=0;
		Song songEntity = convertDtoToEntity(song);
		/*Artist artist=songEntity.getArtist();
		artistRepo.saveAndFlush(artist);
		Album album=songEntity.getAlbum();
		albumRepo.saveAndFlush(album);*/
		Album album=songEntity.getAlbum();
		List<Album> albums=albumRepo.findAll();
		if(albums!=null && album!=null)
		{
			for (Album album2 : albums) {
				if(album2.getAlbumName().equals(album.getAlbumName()))
						{
					       c=1;
					       break;
						}
				
			}
		}
		if(c==0)
		{   
			albumRepo.save(album);
		}
		Artist artist=songEntity.getArtist();
		List<Artist> artists=artistRepo.findAll();
		if(artists!=null && artist!=null)
		{
			for (Artist artist2 : artists) {
				if(artist2.getArtistName().equals(artist.getArtistName()))
						{
					       k=1;
					       break;
						}
				
			}
		}
		if(k==0)
		{  
			artistRepo.save(artist);
		}
		
		
		songEntity.setAlbum(album);
		songEntity.setArtist(artist);
		songRepo.save(songEntity);
		return "Success";
	}
	private Song convertDtoToEntity(SongDto song) {
		// TODO Auto-generated method stub
			return modelMapper.map(song, Song.class);

	}
	public List<SongDto> getSongBySinger(int songId) throws MusicCompanyAppControllerException {
		// TODO Auto-generated method stub
		Song song=songRepo.getOne(songId);
		if(song==null)
		{
			throw new NoSuchSongIsFoundException("No Such Song Found");
		}
	
		List<Song> songs=new  ArrayList<Song>();
		List<Song> songList=songRepo.findAll();
		int c=0;
		for (Song song2 : songList) {
			if(song2.getArtist().getArtistName().equals(song.getArtist().getArtistName()))
			{
				songs.add(song2);
			}
			
		}
	List<SongDto> songDtos =  songs.stream().map(entity->convertEntityToDto(entity)).collect(Collectors.toList());
 
 
	  /* List<SongDto> songDtos=new ArrayList<SongDto>()	;
	   for (Song song3 : songs) {
		   songDtos.add(convertEntityToDto(song3));
		
	}*/
	   return songDtos;
	}
	private SongDto convertEntityToDto(Song song3) {
		// TODO Auto-generated method stub
		

		return modelMapper.map(song3, SongDto.class);
	}
	public int getNumberOfSongsInAlbum(String albumName) throws MusicCompanyAppControllerException {
		List<Album> albums=albumRepo.findAll();
		if(albums==null)
		{
			throw new NoAlbumFoundException("No Album Found");
		}
		int c=0;
		for (Album album : albums) {
			if(album.getAlbumName().equals(albumName))
			{
				c=album.getSongs().size();
				break;
			}
			
		}
		if(c==0)
		{
		  throw new NoSongsFoundException("This Album Not Contain Any Song");
		}
		return c;
	}
	

}
