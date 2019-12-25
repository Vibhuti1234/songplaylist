package com.mindtree.kalingahospitalmanagementsystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.kalingahospitalmanagementsystem.entity.Patient;
import com.mindtree.kalingahospitalmanagementsystem.repository.DoctorRepository;
import com.mindtree.kalingahospitalmanagementsystem.repository.PatientRepository;
import com.mindtree.kalingahospitalmanagementsystem.service.PatientService;
@Service
public class PatientServiceImpl implements PatientService{
@Autowired
PatientRepository patientRepository;
@Autowired
DoctorRepository doctorRepository;
@Override
public String addPatient(Patient patient) {
	// TODO Auto-generated method stub
	patientRepository.save(patient);
	return "success";
}
}
