package com.mindtree.musiccompanyapp.service;

import java.util.List;

import com.mindtree.musiccompanyapp.dto.AlbumDto;
import com.mindtree.musiccompanyapp.entity.Album;
import com.mindtree.musiccompanyapp.entity.Song;
import com.mindtree.musiccompanyapp.exception.MusicCompanyAppControllerException;

public interface AlbumService {

String addAlbum(AlbumDto album) throws MusicCompanyAppControllerException;

	List<Album> getAlbum();

}
