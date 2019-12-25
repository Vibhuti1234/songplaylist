package com.mindtree.kalingahospitalmanagementsystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Doctor {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int doctorId;
private String doctorName;
private int  yOE;
private double salary;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="doctorId")
private List<Patient> patients;
public Doctor() {
	super();
	// TODO Auto-generated constructor stub
}
public Doctor(int doctorId, String doctorName, int yOE, List<Patient> patients,double salary) {
	super();
	this.doctorId = doctorId;
	this.doctorName = doctorName;
	this.yOE = yOE;
	this.salary=salary;
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
public List<Patient> getPatients() {
	return patients;
}
public void setPatients(List<Patient> patients) {
	this.patients = patients;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}
