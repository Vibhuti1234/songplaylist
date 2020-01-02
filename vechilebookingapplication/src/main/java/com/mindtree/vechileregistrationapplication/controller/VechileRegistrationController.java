package com.mindtree.vechileregistrationapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.vechileregistrationapplication.entity.User;
import com.mindtree.vechileregistrationapplication.entity.Vechile;
import com.mindtree.vechileregistrationapplication.exception.VechileRegistrationApplicationException;
import com.mindtree.vechileregistrationapplication.service.UserService;
import com.mindtree.vechileregistrationapplication.service.VechileService;

@Controller
public class VechileRegistrationController {
@Autowired
VechileService vechileService;
@Autowired
UserService userService;
@RequestMapping("/")
public String menu()
{
	return "menu";
}
@RequestMapping("/addUser")
public String addUser()
{
	return "addUser";
}
@PostMapping("/addUsers")
public String addUsers(User user)
{
	userService.addUser(user);
	return "menu";
}
@RequestMapping("/addVechile")
public String addVechile(Model model)
{  model.addAttribute("users", userService.getUsers());
	return "addVechile";
}
@PostMapping("/addVechiles")
public String addVechiles(@RequestParam("userId") int userId,Vechile vechile) throws VechileRegistrationApplicationException
{   vechileService.addVechile(userId,vechile);
	return "menu";
}
@GetMapping("/display")
public String display(Model model)
{    model.addAttribute("users", userService.getAllUsers());
	return "display";
}
}
