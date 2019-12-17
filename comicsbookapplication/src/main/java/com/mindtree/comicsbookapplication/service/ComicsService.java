package com.mindtree.comicsbookapplication.service;

import com.mindtree.comicsbookapplication.dto.ComicsDto;
import com.mindtree.comicsbookapplication.entity.Comics;

public interface ComicsService {

	/**
	 * @param comics
	 * @return
	 */
	String addComics(ComicsDto comics);

	String addComic(Comics comics);

}
