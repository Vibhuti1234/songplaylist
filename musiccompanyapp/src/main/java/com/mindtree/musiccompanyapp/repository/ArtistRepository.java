package com.mindtree.musiccompanyapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.musiccompanyapp.entity.Artist;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, String> {

}
