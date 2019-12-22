package com.mindtree.collegemanagementsystem.service.studentserviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.collegemanagementsystem.dto.StudentDto;
import com.mindtree.collegemanagementsystem.entity.Lab;
import com.mindtree.collegemanagementsystem.entity.Student;
import com.mindtree.collegemanagementsystem.exception.CollegeManagementControllerException;
import com.mindtree.collegemanagementsystem.exception.NoStudentException;
import com.mindtree.collegemanagementsystem.exception.NoSuchLabException;
import com.mindtree.collegemanagementsystem.exception.NoSuchStudentExists;
import com.mindtree.collegemanagementsystem.repository.CollegeRepository;
import com.mindtree.collegemanagementsystem.repository.LabRepository;
import com.mindtree.collegemanagementsystem.repository.StudentRepository;
import com.mindtree.collegemanagementsystem.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private CollegeRepository collegeRepository;
	@Autowired
	private StudentRepository  studentRepository;
	@Autowired
	private LabRepository labRepository;
	private ModelMapper modelMapper=new ModelMapper();
	
	@Override
	public List<StudentDto> getStudentsByLabName(String labName) throws CollegeManagementControllerException {
		// TODO Auto-generated method stub
		List<Lab> labs=labRepository.findAll();
	    Lab lab=labs.stream().filter(i->i.getLabName().equals(labName)).findAny().orElseThrow(()->new NoSuchLabException("Lab Not Found"));
		List<Student> students=lab.getStudents();
		if(students.size()==0)
		{
			throw new NoStudentException("This Lab Doesnt Contain any Student");
		}
		List<StudentDto> studentDtos=students.stream().map(i->convertEntityToDto(i)).collect(Collectors.toList());
		return studentDtos;
	}
	private StudentDto convertEntityToDto(Student i) {
		// TODO Auto-generated method stub
		return modelMapper.map(i, StudentDto.class);
	}
	@Override
	public List<StudentDto> getAllStudentsHaveMoreThanThreeLabs() throws CollegeManagementControllerException {
		int count=0;
		List<Student> studentList=new ArrayList<Student>();
		List<Student> students=studentRepository.findAll();
		for (Student student : students) {
			for(Lab lab : student.getLabs()) {
				count++;	
			}
			if(count>3)
			{
				studentList.add(student);
			}
			count=0;
		}
		if(studentList.size()==0)
		{
			throw new NoSuchStudentExists("No Such Student Exists Who Doing More Than 3 Labs");
		}
		List<StudentDto> studentDtos=studentList.stream().map(i->convertEntityToDto(i)).collect(Collectors.toList());
		return studentDtos;
	}
}