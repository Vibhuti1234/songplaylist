package com.mindtree.classdatamanagementsystem.service;

import java.util.List;

import com.mindtree.classdatamanagementsystem.entity.Student;
import com.mindtree.classdatamanagementsystem.exception.ClassDataManagementApplicationException;

public interface StudentService {

	void addStudent(int classId,Student student) throws ClassDataManagementApplicationException;

	List<Student> getStudentsByClassId(int classId) throws ClassDataManagementApplicationException;

}
