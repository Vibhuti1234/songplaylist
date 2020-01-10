package com.mindtree.bankmanagementsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bankmanagementsystem.entity.User;
import com.mindtree.bankmanagementsystem.exception.ControllerServiceException;
import com.mindtree.bankmanagementsystem.exception.UserNotPresentException;
import com.mindtree.bankmanagementsystem.repository.UserRepository;
import com.mindtree.bankmanagementsystem.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;

	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	@Override
	public Object getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void deleteUser(String userId) throws ControllerServiceException {
		List<User> users=userRepository.findAll();
		User user = users.stream().filter(i -> i.getUserName().compareToIgnoreCase(userId)==0).findAny().orElseThrow(() -> new UserNotPresentException("No User Found"));
		userRepository.delete(user);
	}

}
