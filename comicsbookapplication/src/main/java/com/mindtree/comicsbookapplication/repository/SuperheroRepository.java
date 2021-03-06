package com.mindtree.comicsbookapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.comicsbookapplication.entity.Superhero;
@Repository
public interface SuperheroRepository extends JpaRepository<Superhero, Integer>{

}
