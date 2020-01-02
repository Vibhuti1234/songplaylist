package com.mindtree.collegebranchmanagementapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.collegebranchmanagementapplication.entity.Branch;

@Repository
public interface BranchRepository  extends JpaRepository<Branch, Integer>{

}
