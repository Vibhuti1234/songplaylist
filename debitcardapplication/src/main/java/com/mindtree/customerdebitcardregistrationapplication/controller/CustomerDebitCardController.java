package com.mindtree.customerdebitcardregistrationapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.customerdebitcardregistrationapplication.entity.Customer;
import com.mindtree.customerdebitcardregistrationapplication.entity.DebitCard;
import com.mindtree.customerdebitcardregistrationapplication.exception.CustomerDebitCardApplicationException;
import com.mindtree.customerdebitcardregistrationapplication.service.CustomerService;
import com.mindtree.customerdebitcardregistrationapplication.service.DebitCardService;

@Controller
public class CustomerDebitCardController {
	@Autowired
	CustomerService customerService;
	@Autowired
	DebitCardService debitCardService;
	@RequestMapping("/")
	public String menu()
	{
		return "menu";
		
	}
	@RequestMapping("/addCustomer")
	public String addCustomer()
	{
		return "addCustomer";
	}
	@PostMapping("/addCustomers")
	public String addCustomers(Customer customer)
	{
		customerService.addCustomer(customer);
		return "menu";
	}
	@RequestMapping("/addDebitCard")
	public String addDebitCard(Model model)
	{
		model.addAttribute("customers", customerService.getAllCustomers());
		return "addDebitCard";
	}
	@PostMapping("/addDebitCards")
	public String addDebitCards(@RequestParam("customerId") int customerId,DebitCard debitCard) throws CustomerDebitCardApplicationException
	{  debitCardService.bookDebitCardToCustomer(customerId,debitCard);
		return "menu";
	}
	@RequestMapping("/display")
	public String display(Model model)
	{ model.addAttribute("customers", customerService.getCustomersSorted());
		return "display";
	}
	
			
}
