package com.mindtree.musiccompanyapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.musiccompanyapp.entity.Album;
@Repository
public interface AlbumRepository  extends JpaRepository<Album, String>{

}
