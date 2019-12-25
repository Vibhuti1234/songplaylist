package com.mindtree.kalingahospitalmanagementsystem.dto;

import java.util.List;

public class DoctorDto implements Comparable<DoctorDto>{

	private int doctorId;
	private String doctorName;
	private int  yOE;
	private double salary;
	private List<PatientDto> patients;
	public DoctorDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DoctorDto(int doctorId, String doctorName, int yOE, double salary, List<PatientDto> patients) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.yOE = yOE;
		this.salary = salary;
		this.patients = patients;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getyOE() {
		return yOE;
	}
	public void setyOE(int yOE) {
		this.yOE = yOE;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public List<PatientDto> getPatients() {
		return patients;
	}
	public void setPatients(List<PatientDto> patients) {
		this.patients = patients;
	}
	@Override
	public int compareTo(DoctorDto e) {
		// TODO Auto-generated method stub
		return (this.yOE-e.yOE);
	}
	
}
