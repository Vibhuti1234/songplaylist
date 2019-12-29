package com.mindtree.classdatamanagementsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.classdatamanagementsystem.entity.Classes;
import com.mindtree.classdatamanagementsystem.entity.Student;
import com.mindtree.classdatamanagementsystem.exception.ClassDataManagementApplicationException;
import com.mindtree.classdatamanagementsystem.exception.NoSuchClassFoundException;
import com.mindtree.classdatamanagementsystem.repository.ClassesRepository;
import com.mindtree.classdatamanagementsystem.repository.StudentRepository;
import com.mindtree.classdatamanagementsystem.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
@Autowired
StudentRepository studentRepository;
@Autowired
ClassesRepository classesRepository;
@Override
public void addStudent(int classId,Student student) throws ClassDataManagementApplicationException {
	// TODO Auto-generated method stub
	Classes classes=classesRepository.findAll().stream().filter(i->i.getClassId()==classId).findAny().orElseThrow(()->new NoSuchClassFoundException("No Class Found Exception:"));
	student.setClasses(classes);
	classes.getStudents().add(student);
	classesRepository.saveAndFlush(classes);
}
@Override
public List<Student> getStudentsByClassId(int classId) throws ClassDataManagementApplicationException{
	// TODO Auto-generated method stub
	Classes classes=classesRepository.findAll().stream().filter(i->i.getClassId()==classId).findAny().orElseThrow(()->new NoSuchClassFoundException("No Class Found Exception:"));
   
	return classes.getStudents();
}
}
