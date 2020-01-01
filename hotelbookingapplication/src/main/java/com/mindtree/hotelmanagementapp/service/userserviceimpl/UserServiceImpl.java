package com.mindtree.hotelmanagementapp.service.userserviceimpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.hotelmanagementapp.entity.User;
import com.mindtree.hotelmanagementapp.exception.HotelManagementSystemApplicationException;
import com.mindtree.hotelmanagementapp.exception.InvalidEmailException;
import com.mindtree.hotelmanagementapp.exception.NoUserFoundException;
import com.mindtree.hotelmanagementapp.repository.UserRepository;
import com.mindtree.hotelmanagementapp.service.UserService;
@Service
public class UserServiceImpl implements UserService {
@Autowired
UserRepository userRepo;

public void bookUser( User user) {
	// TODO Auto-generated method stub
	userRepo.saveAndFlush(user);
	
}

public List<User> getUser(String roomType) throws HotelManagementSystemApplicationException {
	// TODO Auto-generated method stub
	List<User> users=userRepo.findAll();
	if(users==null)
	{
		throw new NoUserFoundException("No Booking Found");
	}
	List<User> listUser=new ArrayList<User>();
   int count=0;
   for (User user : users) {
	   if(user.getRoomType().equals(roomType)==true)
	   {
		   listUser.add(user);
		   count=1;
	   }
	
}
   if(count==0)
   {
	   throw new NoUserFoundException("No Booking Found");
   }
   return listUser;
}

public User getUserByEmail(String userEmail) throws HotelManagementSystemApplicationException {

	List<User> users=userRepo.findAll();
	for (User user : users) {
		System.out.println(user.getUserEmail());

	}
      User matchedUser=new User();
      int count=0;
	   for (User user : users) {
		   if(user.getUserEmail().equalsIgnoreCase(userEmail))
		   {
			   matchedUser=user;
			   count=1;
			   break;
		   }
		
	}
	if(count==0)
	{
		throw new InvalidEmailException("Invalid Email Check Again");
	}
		
	return matchedUser;	
	
}

public void updateCustomer(User user) {
	userRepo.saveAndFlush(user);
	
}
}
