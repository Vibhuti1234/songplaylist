package com.mindtree.insurancepolicy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.insurancepolicy.dto.CustomerDto;
import com.mindtree.insurancepolicy.dto.PolicyDetailsDto;
import com.mindtree.insurancepolicy.dto.ResponseDto;
import com.mindtree.insurancepolicy.entiy.Customer;
import com.mindtree.insurancepolicy.entiy.Transaction;
import com.mindtree.insurancepolicy.exception.ServiceException;
import com.mindtree.insurancepolicy.service.InsurancePolicyService;

@RestController
public class InsurancePolicyController {
	
	@Autowired
	InsurancePolicyService insuranceService;
	
	@PostMapping(value = "/add-customer/{policyId}")
	public ResponseEntity<ResponseDto> addCustomer(@RequestBody CustomerDto customers,@PathVariable int policyId) throws ServiceException {
		
//		Customer customerDto=insuranceService.addCustomers(customers,policyId);
		//System.out.println(customerDto);
		ResponseDto response=new ResponseDto(insuranceService.addCustomers(customers,policyId), null, "Customer Onboarded", true);
		return ResponseEntity.status(HttpStatus.OK).body(response);
		//return null;
		
	}
	@GetMapping(value = "/customer/{customerId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseDto> getAllTransactions(@PathVariable int customerId) {
		//List<Transaction> tranaction=insuranceService.getAllTransactions(customerId);
		//System.out.println(cam);
		//System.out.println(cam);
		ResponseDto response=new ResponseDto(insuranceService.getAllTransactions(customerId), null, "Assigned", true);
		return ResponseEntity.status(HttpStatus.OK).body(response);
		//return tranaction;
	}
	@GetMapping(value = "/policy/{customerId}/{transactionId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseDto> getAllDetails(@PathVariable int customerId,@PathVariable int transactionId) {
		PolicyDetailsDto policyDetailsDto=insuranceService.getAllDetails(customerId,transactionId);
		//System.out.println(cam);
		//System.out.println(cam);
		System.out.println(policyDetailsDto);
		ResponseDto response=new ResponseDto(insuranceService.getAllDetails(customerId,transactionId), null, "Assigned", true);
		return ResponseEntity.status(HttpStatus.OK).body(response);
		//return tranaction;
	}

	

	
}
