package com.mindtree.kalingahospitalmanagementsystem.service;

import java.util.List;

import com.mindtree.kalingahospitalmanagementsystem.dto.DoctorDto;
import com.mindtree.kalingahospitalmanagementsystem.dto.DoctorDto1;
import com.mindtree.kalingahospitalmanagementsystem.entity.Doctor;
import com.mindtree.kalingahospitalmanagementsystem.exception.KaligaHospitalApplicationException;

public interface DoctorService {

	String addDoctor(Doctor doctor);

	String assignPatientToDoctor(String patientName, String doctorName) throws KaligaHospitalApplicationException;

	List<DoctorDto> displayDoctorDetail(int doctorId) throws KaligaHospitalApplicationException;

	List<DoctorDto> displayDoctorsByPatientCount();

}
