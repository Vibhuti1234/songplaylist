package com.mindtree.collegemanagementsystem.service;

import java.util.List;

import com.mindtree.collegemanagementsystem.dto.StudentDto;
import com.mindtree.collegemanagementsystem.exception.CollegeManagementControllerException;

public interface StudentService {

	List<StudentDto> getStudentsByLabName(String labName) throws CollegeManagementControllerException;

	List<StudentDto> getAllStudentsHaveMoreThanThreeLabs() throws CollegeManagementControllerException;

}
