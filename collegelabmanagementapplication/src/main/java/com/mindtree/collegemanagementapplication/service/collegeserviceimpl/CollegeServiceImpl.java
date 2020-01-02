package com.mindtree.collegemanagementapplication.service.collegeserviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.collegemanagementapplication.entity.College;
import com.mindtree.collegemanagementapplication.exception.CollegeAlreadyPresentException;
import com.mindtree.collegemanagementapplication.exception.CollegeManagementApplicationControllerException;
import com.mindtree.collegemanagementapplication.repository.CollegeRepository;
import com.mindtree.collegemanagementapplication.repository.LabRepository;
import com.mindtree.collegemanagementapplication.repository.StudentRepository;
import com.mindtree.collegemanagementapplication.service.CollegeService;
@Service
public class CollegeServiceImpl implements CollegeService{
	static int c=0;
	@Autowired
	private CollegeRepository collegeRepository;
	@Autowired
	private StudentRepository  studentRepository;
	@Autowired
	private LabRepository labRepository;
	@Override
	public void addCollege(College college) throws CollegeManagementApplicationControllerException {
		// TODO Auto-generated method stub
		
		List<College> colleges=collegeRepository.findAll();
		if(colleges.size()!=0 && college!=null) {
		colleges.stream().forEach(i->{if(i.getCollegeName().equals(college.getCollegeName())) {c=1;}});}
		if(c==1)
		{
			throw new CollegeAlreadyPresentException("College is Already Present");
		}
		c=0;
		collegeRepository.save(college);
		
	}

}
