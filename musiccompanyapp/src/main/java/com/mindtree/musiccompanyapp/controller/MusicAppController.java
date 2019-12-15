package com.mindtree.musiccompanyapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.musiccompanyapp.dto.AlbumDto;
import com.mindtree.musiccompanyapp.dto.SongDto;
import com.mindtree.musiccompanyapp.entity.Album;
import com.mindtree.musiccompanyapp.entity.Song;
import com.mindtree.musiccompanyapp.exception.MusicCompanyAppControllerException;
import com.mindtree.musiccompanyapp.service.AlbumService;
import com.mindtree.musiccompanyapp.service.ArtistService;
import com.mindtree.musiccompanyapp.service.SongService;

@RestController
public class MusicAppController {
	@Autowired
	ArtistService artistService;
	@Autowired
	SongService songService;
	@Autowired
	AlbumService albumService;
	
	@PostMapping( value="/addSong")
	public String addSong(@RequestBody SongDto song)
	{
		 return songService.addSong(song);
		 
	}
	@PostMapping(value="/addAlbum")
	public String addAlbum(@RequestBody AlbumDto album) throws MusicCompanyAppControllerException
	{
		return albumService.addAlbum(album);
	}
	@GetMapping("/getSongBySinger/{songId}")
	public List<SongDto> getSongBySinger(@PathVariable int songId) throws MusicCompanyAppControllerException
	{
		return  songService.getSongBySinger(songId); 
		
	}
	
	@GetMapping("/getAlbum")
	public List<Album> getTest(){
		List<Album> albums=albumService.getAlbum();
		for (Album album : albums) {
			System.out.println(album.getAlbumName());
			List<Song> songs=album.getSongs();
			for (Song song : songs) {
				System.out.println(song.getSongId()+" "+song.getSongName());
			}
		}
		return albums;
	}
	@GetMapping("/getNumberOfSongsInAlbum/{albumName}")
	public int getNumberOfSongsInAlbum(@PathVariable String albumName) throws MusicCompanyAppControllerException
	{
		return songService.getNumberOfSongsInAlbum(albumName);
	}

}
