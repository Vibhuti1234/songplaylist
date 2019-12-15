package com.mindtree.musiccompanyapp.service;

import java.util.List;

import com.mindtree.musiccompanyapp.dto.SongDto;
import com.mindtree.musiccompanyapp.entity.Song;
import com.mindtree.musiccompanyapp.exception.MusicCompanyAppControllerException;

public interface SongService {

	String addSong(SongDto song);

	List<SongDto> getSongBySinger(int songId) throws MusicCompanyAppControllerException;

	int getNumberOfSongsInAlbum(String albumName) throws MusicCompanyAppControllerException;

}
