package com.mindtree.hotelmanagementapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;







import com.mindtree.hotelmanagementapp.entity.User;
import com.mindtree.hotelmanagementapp.exception.HotelManagementSystemApplicationException;
import com.mindtree.hotelmanagementapp.service.UserService;




@Controller
public class HotelManagementController {
	@Autowired
	UserService userService;
	static String email;

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
	@PostMapping("/bookUser")
	public String bookUser(User user,Model model)
	{
		userService.bookUser(user);
		return "menu";
	}
	@RequestMapping("/view")
	public String displayUser()
	{
		return "showUser";
	}
	@GetMapping("/displayUser")
	public String displayUser(@RequestParam("roomType") String roomType,Model model) throws HotelManagementSystemApplicationException
	{
	 List<User> userList=userService.getUser(roomType);
	 model.addAttribute("listUser",userList);
	 return "showUser";
	}
	@RequestMapping("/update")
	public String update(@RequestParam("userEmail") String userEmail,Model model) throws HotelManagementSystemApplicationException
	{  System.out.println("Hello");
	  System.out.println(userEmail);
       
		User matchedUser= userService.getUserByEmail(userEmail);
	  System.out.println(matchedUser.getUserName());
	 model.addAttribute("user",matchedUser);
	return "editUser";

	}
	@PostMapping("/updateCustomer")
	public String updateCustomer(User user)
	{System.out.println("hello");
		userService.updateCustomer(user);
		return "menu";
	}
	
	
}
