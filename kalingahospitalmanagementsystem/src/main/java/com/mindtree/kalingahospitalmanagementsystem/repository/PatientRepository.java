package com.mindtree.kalingahospitalmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.kalingahospitalmanagementsystem.entity.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
