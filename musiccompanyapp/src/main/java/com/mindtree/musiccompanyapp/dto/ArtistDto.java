package com.mindtree.musiccompanyapp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;


public class ArtistDto {
	@Id
	@Column(name="artistName")
	private String artistName;
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="artist")
	private List<SongDto> songs;
	public ArtistDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArtistDto(String artistName, List<SongDto> songs) {
		super();
		this.artistName = artistName;
		this.songs = songs;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public List<SongDto> getSongs() {
		return songs;
	}
	public void setSongs(List<SongDto> songs) {
		this.songs = songs;
	}
	
	

}

