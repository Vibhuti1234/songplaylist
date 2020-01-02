package com.mindtree.collegemanagementapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.collegemanagementapplication.entity.College;
import com.mindtree.collegemanagementapplication.entity.Lab;
import com.mindtree.collegemanagementapplication.entity.Student;
import com.mindtree.collegemanagementapplication.exception.CollegeManagementApplicationControllerException;
import com.mindtree.collegemanagementapplication.service.CollegeService;
import com.mindtree.collegemanagementapplication.service.LabService;
import com.mindtree.collegemanagementapplication.service.StudentService;

@Controller
public class CollegeManagementApplicationController {
	@Autowired
	private CollegeService collegeService;
	@Autowired
	private LabService labService;
	@Autowired
	private StudentService studentService;
	@RequestMapping("/")
	public String menu()
	{
	   return "addCollege";
	}
	@PostMapping("/addCollege")
	public String addCollege(College college,Model model) throws CollegeManagementApplicationControllerException
	{   collegeService.addCollege(college);
	     model.addAttribute("college",college);
		return "addLab";
		
	}
	int labid=0;
	@PostMapping("/addLab")
	public String addLab(@RequestParam("collegeName") String collegeName,Lab lab,Model model) throws CollegeManagementApplicationControllerException
	{    labService.addLab(collegeName,lab);
    model.addAttribute("collegeName",collegeName);
		return "addLabs";
		
	} 
	@GetMapping("/displayLab")
	public String getLab(Model model)
	{  List<Lab> labs=labService.getAllLabs();
	model.addAttribute("labList", labs);
		return "addLabs";
	}
	@RequestMapping("/addStudent")
	public String addStudent(@RequestParam("labId") int labId,Model model)
	{   model.addAttribute("labId",labId);
		return "addStudent";
	}
	@PostMapping("/addStudents")
	public String addStudents(@RequestParam("labId") int labId,Student student,Model model) throws CollegeManagementApplicationControllerException
	{  studentService.addStudent(labId,student);
	  model.addAttribute("labId", labId);
	  return "addStudent";	
	}
	@GetMapping("/displayStudent")
	public String displayStudent(Model model)
	{
		List<Student> students=studentService.getStudent();
		model.addAttribute("students",students);
		return "addStudent";
	}
	@RequestMapping("addLabs")
	public String addLabs(@RequestParam("studentId") int studentId,Model model)
	{
		model.addAttribute("studentId",studentId);
		return "addLabToStudent";
	}
	@PostMapping("/addLabToStudent")
	public String addLabToStudent(@RequestParam("studentId") int studentId,Lab lab,Model model) throws CollegeManagementApplicationControllerException
	{
		labService.addLabToStudent(studentId,lab);
		model.addAttribute("studentId",studentId);
		return "addLabToStudent";
	}
	
}