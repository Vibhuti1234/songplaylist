package com.mindtree.collegemanagementapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.collegemanagementapplication.entity.Lab;

@Repository
public interface LabRepository extends JpaRepository<Lab, Integer>{

}
