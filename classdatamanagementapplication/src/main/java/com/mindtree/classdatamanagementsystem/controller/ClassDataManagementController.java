package com.mindtree.classdatamanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.classdatamanagementsystem.entity.Classes;
import com.mindtree.classdatamanagementsystem.entity.Student;
import com.mindtree.classdatamanagementsystem.exception.ClassDataManagementApplicationException;
import com.mindtree.classdatamanagementsystem.service.ClassesService;
import com.mindtree.classdatamanagementsystem.service.StudentService;

@Controller
public class ClassDataManagementController {
	@Autowired
	StudentService studentService;
	@Autowired
	ClassesService classesService;
	@RequestMapping("/") 
	public String menu()
	{
		return "menu";
	}
	@RequestMapping("/addClass")
	public String addClass()
	{
		return "addClass";
	}
	@PostMapping("/addClasses")
	public String addClasses(Classes classes)
	{
	 classesService.addClasses(classes);
	 return "menu";
	}
	@RequestMapping("/addStudent")
	public String addStudent(Model model)
	{
		List<Classes> classes=classesService.getAllClasses();
		model.addAttribute("classes",classes );
		return "addStudent";
	}
	@PostMapping("/addStudents")
	public String addStudents(@RequestParam("classId") int classId,Student student) throws ClassDataManagementApplicationException
	{
		studentService.addStudent(classId,student);
		return "menu";
	}
	@RequestMapping("/displayStudent")
	public String displayStudent(Model model)
	{
		List<Classes> classes=classesService.getAllClasses();
		model.addAttribute("classes", classes);
		return "display";
	}
	@GetMapping("/displayStudents")
	public String displayStudents(Model model,@RequestParam("classId") int classId) throws ClassDataManagementApplicationException
	{
		List<Student> students=studentService.getStudentsByClassId(classId);
		model.addAttribute("students", students);
		return "display";
	}
	

}
