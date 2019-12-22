package com.mindtree.collegemanagementsystem.service;

import java.util.List;

import com.mindtree.collegemanagementsystem.dto.LabDto;
import com.mindtree.collegemanagementsystem.dto.StudentDto;
import com.mindtree.collegemanagementsystem.exception.CollegeManagementControllerException;

public interface LabService {

	List<LabDto> getAllLabsByStudentId(int studentId) throws CollegeManagementControllerException;

}
