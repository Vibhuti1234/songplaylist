package com.mindtree.collegebranchmanagementapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.collegebranchmanagementapplication.entity.Branch;
import com.mindtree.collegebranchmanagementapplication.entity.College;
import com.mindtree.collegebranchmanagementapplication.repository.BranchRepository;
import com.mindtree.collegebranchmanagementapplication.repository.CollegeRepository;
import com.mindtree.collegebranchmanagementapplication.service.CollegeService;

@Service
public class CollegeServiceImpl  implements CollegeService{
@Autowired
CollegeRepository collegeRepository;
@Autowired
BranchRepository branchRepository;
@Override
public void addCollege(College college) {
	// TODO Auto-generated method stub
	collegeRepository.save(college);
}
@Override
public List<College> getColleges() {
	// TODO Auto-generated method stub
	return collegeRepository.findAll();
}
}
