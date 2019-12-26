package com.mindtree.kalingahospitalmanagementsystem.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.kalingahospitalmanagementsystem.dto.DoctorDto;
import com.mindtree.kalingahospitalmanagementsystem.dto.DoctorDto1;
import com.mindtree.kalingahospitalmanagementsystem.entity.Doctor;
import com.mindtree.kalingahospitalmanagementsystem.entity.Patient;
import com.mindtree.kalingahospitalmanagementsystem.exception.KaligaHospitalApplicationException;
import com.mindtree.kalingahospitalmanagementsystem.exception.NoDoctorFoundException;
import com.mindtree.kalingahospitalmanagementsystem.exception.NoPatientFoundException;
import com.mindtree.kalingahospitalmanagementsystem.repository.DoctorRepository;
import com.mindtree.kalingahospitalmanagementsystem.repository.PatientRepository;
import com.mindtree.kalingahospitalmanagementsystem.service.DoctorService;
@Service
public class DoctorServiceImpl implements DoctorService {
	static double salary;
     static int count=0;
	@Autowired
	PatientRepository patientRepository;
	@Autowired
	DoctorRepository doctorRepository;
	ModelMapper modelMapper=new ModelMapper();
	@Override
	public String addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorRepository.save(doctor);
		return "success";
	}
	@Override
	public String assignPatientToDoctor(String patientName, String doctorName) throws KaligaHospitalApplicationException {
		// TODO Auto-generated method stub
		//List<Doctor> doctors=doctorRepository.findAll();
		Doctor doctor=doctorRepository.findAll().stream().filter(i->i.getDoctorName().equals(doctorName)).findAny().orElseThrow(()->new NoDoctorFoundException("Doctor Not Found"));
	Patient patient=patientRepository.findAll().stream().filter(i->i.getPatientName().equals(patientName)).findAny().orElseThrow(()->new NoPatientFoundException("Patient Not Found"));
	doctor.getPatients().add(patient);
	       doctorRepository.saveAndFlush(doctor);
			return "success";
	}
	@Override
	public List<DoctorDto> displayDoctorDetail(int doctorId) throws KaligaHospitalApplicationException {
		// TODO Auto-generated method stub
		Doctor doctor=doctorRepository.findAll().stream().filter(i->i.getDoctorId()==doctorId).findAny().orElseThrow(()->new NoDoctorFoundException("Invalid Id"));
		doctor.getPatients().stream().forEach(i->{ salary=salary+i.getBill();});
		doctor.setSalary(salary);
		doctorRepository.saveAndFlush(doctor);
		List<DoctorDto> doctorDtos=new ArrayList<DoctorDto>();
		DoctorDto doctorDto=convertEntityToDto(doctor);
		doctorDtos.add(doctorDto);
		
		return doctorDtos;
	}
	private DoctorDto convertEntityToDto(Doctor doctor) {
		// TODO Auto-generated method stub
		return modelMapper.map(doctor, DoctorDto.class);
	}
	@Override
	public List<DoctorDto> displayDoctorsByPatientCount() {
		// TODO Auto-generated method stub
		List<Doctor> doctors=new ArrayList<Doctor>();
		    doctorRepository.findAll().stream().forEach(i->{i.getPatients().stream().forEach(j->{count++;});if(count>3) {doctors.add(i);}count=0;});
		    List<DoctorDto> doctorDtos=doctors.stream().map(i->convertEntityToDto(i)).collect(Collectors.toList());
		    Collections.sort(doctorDtos);
		return doctorDtos;
	}
	
}
