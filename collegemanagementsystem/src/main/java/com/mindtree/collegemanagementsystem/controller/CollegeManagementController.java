package com.mindtree.collegemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.collegemanagementsystem.dto.LabDto;
import com.mindtree.collegemanagementsystem.dto.StudentDto;
import com.mindtree.collegemanagementsystem.entity.College;
import com.mindtree.collegemanagementsystem.exception.CollegeManagementControllerException;
import com.mindtree.collegemanagementsystem.service.CollegeService;
import com.mindtree.collegemanagementsystem.service.LabService;
import com.mindtree.collegemanagementsystem.service.StudentService;

@RestController
public class CollegeManagementController {
	@Autowired
	private CollegeService collegeService;
	@Autowired
	private LabService labService;
	@Autowired
	private StudentService studentService;
	@PostMapping(value="/addCollege")
	private String addCollege(@RequestBody College college) throws CollegeManagementControllerException
	{
		return collegeService.addCollege(college);
	}
	@GetMapping(value="/getAllLabsByStudentId/{studentId}")
	private List<LabDto> getAllLabsByStudentId(@PathVariable int studentId) throws CollegeManagementControllerException
	{
		return labService.getAllLabsByStudentId(studentId);
	}
	@GetMapping(value="/getStudentsByLabName/{labName}")
	private List<StudentDto> getStudentsByLabName(@PathVariable String labName) throws CollegeManagementControllerException
	{
		return studentService.getStudentsByLabName(labName);
	}
    @GetMapping(value="/getAllStudentsHaveMoreThanThreeLabs")
    private List<StudentDto> getAllStudentsHaveMoreThanThreeLabs() throws CollegeManagementControllerException
    {
    	return studentService.getAllStudentsHaveMoreThanThreeLabs();
    }
}
