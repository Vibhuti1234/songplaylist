package com.mindtree.collegemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.collegemanagementsystem.entity.College;
@Repository
public interface CollegeRepository extends JpaRepository<College, Integer>{

}
