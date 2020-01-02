package com.mindtree.vechileregistrationapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.vechileregistrationapplication.entity.User;
import com.mindtree.vechileregistrationapplication.repository.UserRepository;
import com.mindtree.vechileregistrationapplication.repository.VechileRepository;
import com.mindtree.vechileregistrationapplication.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	VechileRepository vechileRepository;
	@Autowired
	UserRepository userRepository;
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		
	}
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	

}
