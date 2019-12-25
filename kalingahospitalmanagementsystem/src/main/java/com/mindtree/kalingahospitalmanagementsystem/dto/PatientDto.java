package com.mindtree.kalingahospitalmanagementsystem.dto;

public class PatientDto {
	private int patientId;
	private String patientName;
	private double bill;
	public PatientDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientDto(int patientId, String patientName, double bill) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.bill = bill;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public double getBill() {
		return bill;
	}
	public void setBill(double bill) {
		this.bill = bill;
	}
	

}
