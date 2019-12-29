package com.mindtree.classdatamanagementsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.classdatamanagementsystem.entity.Classes;
import com.mindtree.classdatamanagementsystem.repository.ClassesRepository;
import com.mindtree.classdatamanagementsystem.repository.StudentRepository;
import com.mindtree.classdatamanagementsystem.service.ClassesService;
@Service
public class ClassesServiceImpl implements ClassesService {
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	ClassesRepository classesRepository;
	@Override
	public void addClasses(Classes classes) {
		// TODO Auto-generated method stub
		classesRepository.save(classes);
	}
	@Override
	public List<Classes> getAllClasses() {
		// TODO Auto-generated method stub
		return classesRepository.findAll();
	}
}
