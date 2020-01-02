package com.mindtree.collegebranchmanagementapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.collegebranchmanagementapplication.entity.College;
@Repository
public interface CollegeRepository extends JpaRepository<College, Integer>{

}
