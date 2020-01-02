package com.mindtree.vechileregistrationapplication.service;

import java.util.List;

import com.mindtree.vechileregistrationapplication.entity.User;

public interface UserService {

	void addUser(User user);

	List<User> getUsers();

	List<User> getAllUsers();

}
