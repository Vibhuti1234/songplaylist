package com.mindtree.collegemanagementapplication.service.labserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.collegemanagementapplication.entity.College;
import com.mindtree.collegemanagementapplication.entity.Lab;
import com.mindtree.collegemanagementapplication.entity.Student;
import com.mindtree.collegemanagementapplication.exception.CollegeManagementApplicationControllerException;
import com.mindtree.collegemanagementapplication.exception.NoCollegeExistsException;
import com.mindtree.collegemanagementapplication.exception.NoStudentFoundException;
import com.mindtree.collegemanagementapplication.repository.CollegeRepository;
import com.mindtree.collegemanagementapplication.repository.LabRepository;
import com.mindtree.collegemanagementapplication.repository.StudentRepository;
import com.mindtree.collegemanagementapplication.service.LabService;
@Service
public class LabServiceImpl implements LabService{
	@Autowired
	private CollegeRepository collegeRepository;
	@Autowired
	private StudentRepository  studentRepository;
	@Autowired
	private LabRepository labRepository;
	@Override
	public void addLab(String collegeName, Lab lab) throws CollegeManagementApplicationControllerException {
		// TODO Auto-generated method stub
	    List<College> colleges=collegeRepository.findAll();
		College college=colleges.stream().filter(i->i.getCollegeName().equals(collegeName)).findAny().orElseThrow(()->new NoCollegeExistsException("No Such College  Exists"));
		lab.setCollege(college);
		labRepository.save(lab);
	}
	@Override
	public List<Lab> getAllLabs() {
		// TODO Auto-generated method stub
		return labRepository.findAll();
	}
	@Override
	public void addLabToStudent(int studentId, Lab lab) throws CollegeManagementApplicationControllerException {
		// TODO Auto-generated method stub
		List<Student> students=studentRepository.findAll();
		System.out.println("Lab Name : " + lab.getLabId() + " Lab Id : " + lab.getLabName());
		if(students.size()==0)
		{
			throw new NoStudentFoundException("No Student Found :");
		}
		Student student=students.stream().filter(i->i.getStudentId()==studentId).findAny().orElseThrow(()->new NoStudentFoundException("No Student Exists With Such Id:"));
		
		student.getLabs().add(lab);
		labRepository.save(lab);
		studentRepository.save(student);
		
	}
}
