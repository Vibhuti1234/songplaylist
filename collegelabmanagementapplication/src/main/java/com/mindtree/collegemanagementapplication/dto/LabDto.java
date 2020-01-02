package com.mindtree.collegemanagementapplication.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class LabDto {
	private int labId;
	private String labName;
	@JsonIgnoreProperties("labs")
	private CollegeDto college=new CollegeDto();
	@JsonIgnoreProperties("labs")
	private List<StudentDto> students=new ArrayList<StudentDto>();
	public LabDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LabDto(int labId, String labName, CollegeDto college, List<StudentDto> students) {
		super();
		this.labId = labId;
		this.labName = labName;
		this.college = college;
		this.students = students;
	}
	public int getLabId() {
		return labId;
	}
	public void setLabId(int labId) {
		this.labId = labId;
	}
	public String getLabName() {
		return labName;
	}
	public void setLabName(String labName) {
		this.labName = labName;
	}
	public CollegeDto getCollege() {
		return college;
	}
	public void setCollege(CollegeDto college) {
		this.college = college;
	}
	public List<StudentDto> getStudents() {
		return students;
	}
	public void setStudents(List<StudentDto> students) {
		this.students = students;
	}
	
	

}
