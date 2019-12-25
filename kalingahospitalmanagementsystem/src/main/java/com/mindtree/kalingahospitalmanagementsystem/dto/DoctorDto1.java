package com.mindtree.kalingahospitalmanagementsystem.dto;

public class DoctorDto1  implements Comparable<DoctorDto1>{
	private int doctorId;
	private String doctorName;
	private int  yOE;
	private double salary;
	public DoctorDto1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DoctorDto1(int doctorId, String doctorName, int yOE, double salary) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.yOE = yOE;
		this.salary = salary;
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
	@Override
	public int compareTo(DoctorDto1 e) {
		// TODO Auto-generated method stub
		return this.yOE-e.yOE;
	}
	

}
