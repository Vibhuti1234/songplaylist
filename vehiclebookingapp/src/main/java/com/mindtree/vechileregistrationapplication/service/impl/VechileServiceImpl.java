package com.mindtree.vechileregistrationapplication.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.vechileregistrationapplication.entity.User;
import com.mindtree.vechileregistrationapplication.entity.Vechile;
import com.mindtree.vechileregistrationapplication.exception.NoUserFoundException;
import com.mindtree.vechileregistrationapplication.exception.VechileRegistrationApplicationException;
import com.mindtree.vechileregistrationapplication.repository.UserRepository;
import com.mindtree.vechileregistrationapplication.repository.VechileRepository;
import com.mindtree.vechileregistrationapplication.service.VechileService;
@Service
public class VechileServiceImpl implements VechileService{
@Autowired
VechileRepository vechileRepository;
@Autowired
UserRepository userRepository;
@Override
public void addVechile(int userId, Vechile vechile) throws VechileRegistrationApplicationException {
	// TODO Auto-generated method stub
	//Optional<User> user=userRepository.findById(userId);
	User user=userRepository.findAll().stream().filter(i->i.getUserId()==userId).findAny().orElseThrow(()->new NoUserFoundException("user not found"));
	String vechileCode=""+vechile.getVechileName().charAt(0)+vechile.getVechileState().substring(0, 2)+vechile.getVechileCountry().charAt(0);
	vechile.setVechileCode(vechileCode);
	user.getVechiles().add(vechile);
	userRepository.saveAndFlush(user);
	
}
}
