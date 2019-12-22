package com.mindtree.collegemanagementsystem.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class StudentDto {
	private int studentId;
	private String studentName;
	private String studentDepartment;
	@JsonIgnoreProperties("students")
	private List<LabDto> labs;
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDto(int studentId, String studentName, String studentDepartment, List<LabDto> labs) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDepartment = studentDepartment;
		this.labs = labs;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentDepartment() {
		return studentDepartment;
	}
	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}
	public List<LabDto> getLabs() {
		return labs;
	}
	public void setLabs(List<LabDto> labs) {
		this.labs = labs;
	}
	

}
