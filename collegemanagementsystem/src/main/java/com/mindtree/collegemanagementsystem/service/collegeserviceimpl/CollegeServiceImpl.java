package com.mindtree.collegemanagementsystem.service.collegeserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.collegemanagementsystem.entity.College;
import com.mindtree.collegemanagementsystem.entity.Lab;
import com.mindtree.collegemanagementsystem.entity.Student;
import com.mindtree.collegemanagementsystem.exception.CollegeManagementControllerException;
import com.mindtree.collegemanagementsystem.exception.NoLabsException;
import com.mindtree.collegemanagementsystem.repository.CollegeRepository;
import com.mindtree.collegemanagementsystem.repository.LabRepository;
import com.mindtree.collegemanagementsystem.repository.StudentRepository;
import com.mindtree.collegemanagementsystem.service.CollegeService;
@Service
public class CollegeServiceImpl implements CollegeService {
@Autowired
private CollegeRepository collegeRepository;
@Autowired
private StudentRepository  studentRepository;
@Autowired
private LabRepository labRepository;
@Override
public String addCollege(College college) throws CollegeManagementControllerException {
	// TODO Auto-generated method stub
	List<Lab> labs=college.getLabs();
	if(labs.size()==0)
	{
		throw new NoLabsException("This College doesnt have Any labs");
	}
	for (Lab lab : labs) {
		lab.setCollege(college);
		for (Student student : lab.getStudents()) {
			student.getLabs().add(lab);
			
		}
		
	}
	collegeRepository.save(college);
	
	return "success";
}
}
