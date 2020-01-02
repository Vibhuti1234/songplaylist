package com.mindtree.collegemanagementapplication.service;

import java.util.List;

import com.mindtree.collegemanagementapplication.entity.Student;
import com.mindtree.collegemanagementapplication.exception.CollegeManagementApplicationControllerException;

public interface StudentService {

	void addStudent(int libId, Student student) throws CollegeManagementApplicationControllerException;

	List<Student> getStudent();

}
