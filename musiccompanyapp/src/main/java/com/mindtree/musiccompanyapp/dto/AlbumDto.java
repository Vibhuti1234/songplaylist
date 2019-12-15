package com.mindtree.musiccompanyapp.dto;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mindtree.musiccompanyapp.entity.Song;


public class AlbumDto {
	
	private String albumName;
    @JsonIgnore
	private List<SongDto> songs;
	public AlbumDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AlbumDto(String albumName, List<SongDto> songs) {
		super();
		this.albumName = albumName;
		this.songs = songs;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public List<SongDto> getSongs() {
		return songs;
	}
	public void setSongs(List<SongDto> songs) {
		this.songs = songs;
	}
	
	

}
