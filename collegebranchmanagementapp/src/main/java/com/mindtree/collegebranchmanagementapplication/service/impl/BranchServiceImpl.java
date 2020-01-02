package com.mindtree.collegebranchmanagementapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.collegebranchmanagementapplication.entity.Branch;
import com.mindtree.collegebranchmanagementapplication.entity.College;
import com.mindtree.collegebranchmanagementapplication.exception.CollegeBranchApplicationException;
import com.mindtree.collegebranchmanagementapplication.exception.CollegeLimitFullException;
import com.mindtree.collegebranchmanagementapplication.repository.BranchRepository;
import com.mindtree.collegebranchmanagementapplication.repository.CollegeRepository;
import com.mindtree.collegebranchmanagementapplication.service.BranchService;

@Service
public class BranchServiceImpl implements BranchService {
	@Autowired
	CollegeRepository collegeRepository;
	@Autowired
	BranchRepository branchRepository;
	@Override
	public void addBranches(int collegeId, Branch branch) throws CollegeBranchApplicationException {
		// TODO Auto-generated method stub
		College college=collegeRepository.getOne(collegeId);
		college.getBranches().add(branch);
		if(college.getBranches().size()<=college.getNumberOfBranch()) {
		collegeRepository.saveAndFlush(college);}
		else {
			throw new CollegeLimitFullException("Branch Limit Reached For This College:");
		}
		
	}
	@Override
	public List<Branch> getBranchByCollege(int collegeId) {
		// TODO Auto-generated method stub
		College college=collegeRepository.getOne(collegeId);
		return college.getBranches();
	}
	@Override
	public Branch getBranchById(int branchId) {
		// TODO Auto-generated method stub
		return branchRepository.getOne(branchId);
	}
	@Override
	public void updateBranch(Branch branch) {
		// TODO Auto-generated method stub
		//branch.setBranchId(branchId);
		branchRepository.saveAndFlush(branch);
		
		
	}
}
