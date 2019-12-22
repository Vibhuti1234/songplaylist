package com.mindtree.collegemanagementsystem.service;

import com.mindtree.collegemanagementsystem.entity.College;
import com.mindtree.collegemanagementsystem.exception.CollegeManagementControllerException;

public interface CollegeService {

	/**
	 * @param college
	 * @return adding College
	 * @throws CollegeManagementControllerException 
	 */
	String addCollege(College college) throws CollegeManagementControllerException;

}
