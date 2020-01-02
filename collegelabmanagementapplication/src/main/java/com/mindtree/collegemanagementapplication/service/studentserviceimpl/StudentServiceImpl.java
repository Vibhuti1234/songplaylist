package com.mindtree.collegemanagementapplication.service.studentserviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.collegemanagementapplication.entity.Lab;
import com.mindtree.collegemanagementapplication.entity.Student;
import com.mindtree.collegemanagementapplication.exception.CollegeManagementApplicationControllerException;
import com.mindtree.collegemanagementapplication.exception.NoLabFoundException;
import com.mindtree.collegemanagementapplication.repository.CollegeRepository;
import com.mindtree.collegemanagementapplication.repository.LabRepository;
import com.mindtree.collegemanagementapplication.repository.StudentRepository;
import com.mindtree.collegemanagementapplication.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private CollegeRepository collegeRepository;
	@Autowired
	private StudentRepository  studentRepository;
	@Autowired
	private LabRepository labRepository;
	@Override
	public void addStudent(int libId, Student student) throws CollegeManagementApplicationControllerException {
		// TODO Auto-generated method stub
		List<Lab> labs=labRepository.findAll();
		Lab lab=labs.stream().filter(i->i.getLabId()==libId).findAny().orElseThrow(()->new NoLabFoundException("No Such Lab Exists:"));
		student.getLabs().add(lab);
		studentRepository.save(student);
		
	}
	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		
		return studentRepository.findAll();
	}

}
