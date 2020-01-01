package com.mindtree.hotelmanagementapp.service;

import java.util.List;

import com.mindtree.hotelmanagementapp.entity.User;
import com.mindtree.hotelmanagementapp.exception.HotelManagementSystemApplicationException;

public interface UserService {

	void bookUser( User user);

	List<User> getUser(String roomType) throws HotelManagementSystemApplicationException;

	User getUserByEmail(String userEmail) throws HotelManagementSystemApplicationException;

	void updateCustomer(User user);

}
