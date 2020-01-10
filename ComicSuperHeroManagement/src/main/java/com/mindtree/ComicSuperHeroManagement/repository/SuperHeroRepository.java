package com.mindtree.ComicSuperHeroManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.ComicSuperHeroManagement.entity.SuperHero;
@Repository
public interface SuperHeroRepository extends JpaRepository<SuperHero, Integer> {

}
