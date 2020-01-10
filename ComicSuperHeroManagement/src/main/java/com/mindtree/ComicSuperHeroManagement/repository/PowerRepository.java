package com.mindtree.ComicSuperHeroManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.ComicSuperHeroManagement.entity.Power;

@Repository
public interface PowerRepository extends JpaRepository<Power, Integer> {

}
