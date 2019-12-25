  package com.mindtree.kalingahospitalmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.mindtree.kalingahospitalmanagementsystem.entity.Doctor;
@Service
public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

}
