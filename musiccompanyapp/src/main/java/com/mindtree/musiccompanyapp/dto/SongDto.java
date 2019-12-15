package com.mindtree.musiccompanyapp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.mindtree.musiccompanyapp.entity.Album;
import com.mindtree.musiccompanyapp.entity.Artist;

public class SongDto{
	private int songId;

	private String songName;
	private AlbumDto album;

	private ArtistDto artist;
	public SongDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SongDto(int songId, String songName, AlbumDto album, ArtistDto artist) {
		super();
		this.songId = songId;
		this.songName = songName;
		this.album = album;
		this.artist = artist;
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public AlbumDto getAlbum() {
		return album;
	}
	public void setAlbum(AlbumDto album) {
		this.album = album;
	}
	public ArtistDto getArtist() {
		return artist;
	}
	public void setArtist(ArtistDto artist) {
		this.artist = artist;
	}
}

