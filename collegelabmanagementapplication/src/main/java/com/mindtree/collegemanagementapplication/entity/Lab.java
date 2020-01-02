package com.mindtree.collegemanagementapplication.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="lab")
public class Lab {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="labId")
private int labId;
@Column(name="labName")
private String labName;
@ManyToOne
private College college=new College();
@ManyToMany(mappedBy="labs",cascade=CascadeType.ALL)
private List<Student> students=new ArrayList<Student>();
public Lab() {
	super();
	// TODO Auto-generated constructor stub
}
public Lab(int labId, String labName, College college, List<Student> students) {
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
public College getCollege() {
	return college;
}
public void setCollege(College college) {
	this.college = college;
}
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}


}
