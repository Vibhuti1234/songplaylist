package com.mindtree.collegebranchmanagementapplication.service;

import java.util.List;

import com.mindtree.collegebranchmanagementapplication.entity.Branch;
import com.mindtree.collegebranchmanagementapplication.exception.CollegeBranchApplicationException;

public interface BranchService {

	void addBranches(int collegeId, Branch branch) throws CollegeBranchApplicationException;

	List<Branch> getBranchByCollege(int collegeId);

   Branch getBranchById(int branchId);

void updateBranch(Branch branch);
	

}
