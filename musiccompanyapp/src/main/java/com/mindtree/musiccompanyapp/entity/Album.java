package com.mindtree.musiccompanyapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity

public class Album {
	@Id
	@Column(name="albumName")
	private String albumName;

	@OneToMany(cascade=CascadeType.ALL,mappedBy="album")
	private List<Song> songs;
	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Album(String albumName, List<Song> songs) {
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
	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	
	

}
