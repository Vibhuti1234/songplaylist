package com.mindtree.comicsbookapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.comicsbookapplication.entity.Power;

@Repository
public interface PowerRepository extends JpaRepository<Power, Integer> {

}
