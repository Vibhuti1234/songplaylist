package com.mindtree.musiccompanyapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.musiccompanyapp.entity.Song;

@Repository
public interface SongRepository  extends JpaRepository<Song, Integer>{

}
