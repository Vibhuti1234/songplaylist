package com.mindtree.bankmanagementsystem.service;

import com.mindtree.bankmanagementsystem.entity.User;
import com.mindtree.bankmanagementsystem.exception.ControllerServiceException;

public interface UserService {

	void addUser(User user);

	void deleteUser(String userName) throws ControllerServiceException;

	Object getUsers();

}
