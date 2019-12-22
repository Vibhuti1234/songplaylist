package com.mindtree.collegemanagementsystem.service.labserviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.collegemanagementsystem.dto.LabDto;
import com.mindtree.collegemanagementsystem.dto.StudentDto;
import com.mindtree.collegemanagementsystem.entity.Lab;
import com.mindtree.collegemanagementsystem.entity.Student;
import com.mindtree.collegemanagementsystem.exception.CollegeManagementControllerException;
import com.mindtree.collegemanagementsystem.exception.NoLabsFoundException;
import com.mindtree.collegemanagementsystem.exception.NoStudentFoundException;
import com.mindtree.collegemanagementsystem.repository.CollegeRepository;
import com.mindtree.collegemanagementsystem.repository.LabRepository;
import com.mindtree.collegemanagementsystem.repository.StudentRepository;
import com.mindtree.collegemanagementsystem.service.LabService;
@Service
public class LabServiceImpl implements LabService{
	@Autowired
	private CollegeRepository collegeRepository;
	@Autowired
	private StudentRepository  studentRepository;
	@Autowired
	private LabRepository labRepository;
	
	ModelMapper modelMapper=new ModelMapper();

	@Override
	public List<LabDto> getAllLabsByStudentId(int studentId) throws CollegeManagementControllerException {
		// TODO Auto-generated method stub
		Optional<Student> student=studentRepository.findById(studentId);
		student.orElseThrow(()->new NoStudentFoundException("No Such Student Found"));
		List<Lab> labs=student.get().getLabs();
		if(labs.size()==0)
		{
			throw new NoLabsFoundException("This Student Not Attending Labs");
		}
		List<LabDto> labDtos=labs.stream().map(i -> convertEntityToDto(i)).collect(Collectors.toList());
		return labDtos;
	}
	private LabDto convertEntityToDto(Lab i) {
		// TODO Auto-generated method stub
		return modelMapper.map(i,LabDto.class);
	}
}
