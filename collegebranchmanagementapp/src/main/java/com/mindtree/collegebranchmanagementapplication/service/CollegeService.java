package com.mindtree.collegebranchmanagementapplication.service;

import java.util.List;

import com.mindtree.collegebranchmanagementapplication.entity.College;

public interface CollegeService {

	void addCollege(College college);
    List<College> getColleges();

}
