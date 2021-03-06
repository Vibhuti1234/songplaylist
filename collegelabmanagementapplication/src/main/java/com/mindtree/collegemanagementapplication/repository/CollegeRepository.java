package com.mindtree.collegemanagementapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.collegemanagementapplication.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer>{

}
