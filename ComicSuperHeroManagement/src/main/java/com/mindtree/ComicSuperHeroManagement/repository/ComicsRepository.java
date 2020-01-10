package com.mindtree.ComicSuperHeroManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.ComicSuperHeroManagement.entity.Comics;
@Repository
public interface ComicsRepository extends JpaRepository<Comics, Integer> {

	@Query("Select c from Comics c where c.comicsName LIKE 'B%'")
	Comics varComic();
}
