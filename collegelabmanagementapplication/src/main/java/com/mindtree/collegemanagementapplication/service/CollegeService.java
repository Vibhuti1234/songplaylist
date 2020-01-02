package com.mindtree.collegemanagementapplication.service;

import com.mindtree.collegemanagementapplication.entity.College;
import com.mindtree.collegemanagementapplication.exception.CollegeManagementApplicationControllerException;

public interface CollegeService {

	void addCollege(College college) throws CollegeManagementApplicationControllerException;

}
