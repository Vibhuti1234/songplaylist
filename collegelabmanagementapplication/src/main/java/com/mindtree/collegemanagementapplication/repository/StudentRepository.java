package com.mindtree.collegemanagementapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.collegemanagementapplication.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}