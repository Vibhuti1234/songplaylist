package com.mindtree.collegemanagementapplication.service;

import java.util.List;

import com.mindtree.collegemanagementapplication.entity.Lab;
import com.mindtree.collegemanagementapplication.exception.CollegeManagementApplicationControllerException;

public interface LabService {

	void addLab(String collegeName, Lab lab) throws CollegeManagementApplicationControllerException;

	List<Lab> getAllLabs();

	void addLabToStudent(int studentId, Lab lab) throws CollegeManagementApplicationControllerException;

}
