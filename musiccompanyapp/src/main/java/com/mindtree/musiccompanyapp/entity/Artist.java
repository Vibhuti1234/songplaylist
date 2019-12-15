package com.mindtree.musiccompanyapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="artist")
public class Artist {
	@Id
	@Column(name="artistName")
	private String artistName;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="artist")
	private List<Song> songs;
	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Artist(String artistName, List<Song> songs) {
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
	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	
	

}
