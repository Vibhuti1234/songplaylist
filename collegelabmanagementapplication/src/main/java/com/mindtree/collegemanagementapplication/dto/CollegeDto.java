package com.mindtree.collegemanagementapplication.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class CollegeDto {
	private int collegeId;
	private String collegeName;
	private int collegeCapacity;
	private String collegeLocation;
	@JsonIgnoreProperties("college")
	private List<LabDto> labs=new ArrayList<LabDto>();
	public CollegeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CollegeDto(int privateId, String collegeName, int collegeCapacity, String collegeLocation,
			List<LabDto> labs) {
		super();
		this.collegeId = privateId;
		this.collegeName = collegeName;
		this.collegeCapacity = collegeCapacity;
		this.collegeLocation = collegeLocation;
		this.labs = labs;
	}
	public int getPrivateId() {
		return collegeId;
	}
	public void setPrivateId(int privateId) {
		this.collegeId = privateId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getCollegeCapacity() {
		return collegeCapacity;
	}
	public void setCollegeCapacity(int collegeCapacity) {
		this.collegeCapacity = collegeCapacity;
	}
	public String getCollegeLocation() {
		return collegeLocation;
	}
	public void setCollegeLocation(String collegeLocation) {
		this.collegeLocation = collegeLocation;
	}
	public List<LabDto> getLabs() {
		return labs;
	}
	public void setLabs(List<LabDto> labs) {
		this.labs = labs;
	}
	

}
