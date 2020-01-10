package com.mindtree.bankmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.bankmanagementsystem.entity.Bank;
import com.mindtree.bankmanagementsystem.entity.User;
import com.mindtree.bankmanagementsystem.exception.ControllerServiceException;
import com.mindtree.bankmanagementsystem.service.BankService;
import com.mindtree.bankmanagementsystem.service.UserService;
@Controller
public class BankController {
	@Autowired
	BankService bankService;
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String menu()
	{
		return "menu";
	}
	
	@RequestMapping("/addBank")
	public String addBank()
	{
		return "addBank";
	}
	@PostMapping("/addBankToDb")
	public String addBank(Bank bank) throws ControllerServiceException
	{   
		bankService.addBank(bank);
		return "success";
	}
	
	@RequestMapping("/addUser")
	public String addUser()
	{
		return "addUser";
	}
	@PostMapping("/addUserToDb")
	public String addUser(User user)
	{   
		userService.addUser(user);
		return "success";
	}
	
	@RequestMapping("/deleteUser")
	public String deleteUser()
	{
		return "deleteUser";
	}
	@RequestMapping("/delete")
	public String deleteUser(@RequestParam("userName") String userName) throws ControllerServiceException 
	{
		userService.deleteUser(userName);
		return "deleted";
	}
	
	@RequestMapping("/linkBankAndUser")
	public String linkbankWithUser(Model model)
	{
		model.addAttribute("banks", bankService.getBanks());
		model.addAttribute("users", userService.getUsers());
		return "bankUserLinker";
	}
	@PostMapping("/link")
	public String linkBankUser(@RequestParam("bankId") int bankId ,@RequestParam("userId") int userId) throws ControllerServiceException  
	{ 
		bankService.linkBankAndUser(bankId,userId);
		return "success";
	}
	
	@GetMapping("/display")
	public String display(Model model)
	{
		model.addAttribute("banks", bankService.getBanks());
		return "display";
	}


}
