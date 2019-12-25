package com.mindtree.kalingahospitalmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.kalingahospitalmanagementsystem.dto.DoctorDto;
import com.mindtree.kalingahospitalmanagementsystem.dto.DoctorDto1;
import com.mindtree.kalingahospitalmanagementsystem.entity.Doctor;
import com.mindtree.kalingahospitalmanagementsystem.entity.Patient;
import com.mindtree.kalingahospitalmanagementsystem.exception.KaligaHospitalApplicationException;
import com.mindtree.kalingahospitalmanagementsystem.service.DoctorService;
import com.mindtree.kalingahospitalmanagementsystem.service.PatientService;

@RestController
public class KalingaHospitalController {
	@Autowired
	DoctorService doctorService;
	@Autowired
	PatientService patientService;
	@PostMapping("/addDoctor")
	public String addDoctor(@RequestBody Doctor doctor)
	{return doctorService.addDoctor(doctor);
		
	}
	@PostMapping("/addPatient")
	public String addPatient(@RequestBody Patient patient)
	{
		return patientService.addPatient(patient);
	}
	@PostMapping("/assignPatientToDoctor/{patientName}/{doctorName}")
	public String assignPatientToDoctor(@PathVariable String patientName,@PathVariable String doctorName) throws KaligaHospitalApplicationException
	{
		return doctorService.assignPatientToDoctor(patientName,doctorName);
	}
	@GetMapping("/displayDoctorDetail/{doctorId}")
	public List<DoctorDto> displayDoctorDetail(@PathVariable int doctorId) throws KaligaHospitalApplicationException
	{
		return doctorService.displayDoctorDetail(doctorId);
	}
	@GetMapping("/displayDoctorsByPatientCount")
	public List<DoctorDto> displayDoctorsByPatientCount()
	{
		return doctorService.displayDoctorsByPatientCount();
	}

}
