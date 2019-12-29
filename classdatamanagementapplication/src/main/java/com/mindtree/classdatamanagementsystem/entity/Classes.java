package com.mindtree.classdatamanagementsystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Classes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int classId;
	private String section;
	private String teacherName;
	private int noOfStudents;
	@JsonManagedReference
	@OneToMany(cascade=CascadeType.ALL,mappedBy="classes")
	private List<Student> students;
	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classes(int classId, String section, String teacherName, int noOfStudents, List<Student> students) {
		super();
		this.classId = classId;
		this.section = section;
		this.teacherName = teacherName;
		this.noOfStudents = noOfStudents;
		this.students = students;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	

}
