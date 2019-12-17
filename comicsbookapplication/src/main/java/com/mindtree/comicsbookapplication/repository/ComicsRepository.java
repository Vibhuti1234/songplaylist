package com.mindtree.comicsbookapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.comicsbookapplication.entity.Comics;
@Repository
public interface ComicsRepository extends JpaRepository<Comics, Integer> {

}
