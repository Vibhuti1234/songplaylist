package com.mindtree.collegemanagementsystem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="collegeId")
	private int collegeId;
	@Column(name="collegeName",unique=true)
	private String collegeName;
	@Column(name="collegeCapacity")
	private int collegeCapacity;
	@Column(name="collegeLocation")
	private String collegeLocation;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="college")
	private List<Lab> labs=new ArrayList<Lab>();
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int privateId, String collegeName, int collegeCapacity, String collegeLocation, List<Lab> labs) {
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
	public List<Lab> getLabs() {
		return labs;
	}
	public void setLabs(List<Lab> labs) {
		this.labs = labs;
	}
	
}
