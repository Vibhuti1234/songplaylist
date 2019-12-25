package com.mindtree.insurancepolicy.service.serviceimpl;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.insurancepolicy.dto.CustomerDto;
import com.mindtree.insurancepolicy.dto.CustomerTransactionDto;
import com.mindtree.insurancepolicy.dto.PolicyDetailsDto;
import com.mindtree.insurancepolicy.dto.TransactionDto;
import com.mindtree.insurancepolicy.entiy.Customer;
import com.mindtree.insurancepolicy.entiy.Policy;
import com.mindtree.insurancepolicy.entiy.Transaction;
import com.mindtree.insurancepolicy.exception.ServiceException;
import com.mindtree.insurancepolicy.exception.util.ErrorConstatnts;
import com.mindtree.insurancepolicy.repo.CustomerRepo;
import com.mindtree.insurancepolicy.repo.PolicyRepo;
import com.mindtree.insurancepolicy.repo.TransactionRepo;
import com.mindtree.insurancepolicy.service.InsurancePolicyService;

@Service
public class InsurancePolicyServiceImpl implements InsurancePolicyService {

	@Autowired
	CustomerRepo customerRepository;

	@Autowired
	PolicyRepo policyRepository;
	@Autowired
	TransactionRepo transactionRepository;
	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public Customer addCustomers(CustomerDto customers, int policyId) throws ServiceException {
		
		Optional<Policy> policies= policyRepository.findById(policyId);
		
		policies.orElseThrow(()->new ServiceException(ErrorConstatnts.POLICYNOTFOUND));
		Policy policy = policies.get();
		Customer customer = convertDtoToCustomerEntity(customers);
		List<Transaction> transactionList = customer.getTransactions();
		for (Transaction transaction : transactionList) {
			transaction.setCustomer(customer);
			transaction.setPolicy(policy);
		}
		customerRepository.save(customer);
		return customer;
	}

	private Customer convertDtoToCustomerEntity(CustomerDto customersDto) {
		return modelMapper.map(customersDto, Customer.class);
	}

	private CustomerDto convertCustomerEntityToDto(Customer customerEntity) {
		return modelMapper.map(customerEntity, CustomerDto.class);
	}

	@Override
	public CustomerTransactionDto getAllTransactions(int customerId) {
		// TODO Auto-generated method stub
	
		Customer customer = customerRepository.findById(customerId).get();
		List<Transaction> transaction = customer.getTransactions();
		CustomerTransactionDto cust = new CustomerTransactionDto();
		cust.setCustomerId(customerId);
		cust.setCustomerName(customer.getCustomerName());
		
		List<TransactionDto> transactionList= new ArrayList<TransactionDto>();
		if(transaction.size()!=0)
		{
		for (int i = 0; i < transaction.size(); i++) {
			TransactionDto trDt= new TransactionDto();
			Transaction trObj=transaction.get(i);
			int monthlyAmnt=trObj.getMonthlyTransactionAmount();
			Date creationDate= trObj.getStartingDate();
			Instant instant = Instant.ofEpochMilli(creationDate.getTime());
			LocalDate date =LocalDateTime.ofInstant(instant, ZoneId.systemDefault())
	        .toLocalDate();
//		 creationDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			//LocalDate startDate=LocalDate.ofInstant(creationDate.toInstant(), ZoneId.systemDefault());
			 LocalDate endDate = LocalDate.now(); 
			 int months =(int) (ChronoUnit.MONTHS.between(date, endDate));
			 int turnOver = monthlyAmnt * ((1 + 10 / 1200) ^ months);
			 trDt.setMonthlyTransactionAmount(monthlyAmnt);
			 trDt.setMaturityAmount(turnOver);
			 transactionList.add(trDt);

		}
		cust.setTransactionList(transactionList);
		
		}
		//customer.setTransactions(transaction);
		return cust;

	}

	@Override
	public PolicyDetailsDto getAllDetails(int customerId, int transactionId) {
		// TODO Auto-generated method stub
		Customer customer=customerRepository.findById(customerId).get();
		PolicyDetailsDto poli= new PolicyDetailsDto();
		poli.setCustomerId(customer.getCustomerId());
		poli.setCustomerName(customer.getCustomerName());
		Transaction trOb=transactionRepository.findById(transactionId).get();
		Policy policy=trOb.getPolicy();
		int policyId=policy.getPolicyId();
		int year=(int)policy.getMaturityTerm();
		int month=year*12;
		int totalamountInvested=(trOb.getMonthlyTransactionAmount())*12*year;
		poli.setTotalAmountInvested(totalamountInvested);
		int monthly=trOb.getMonthlyTransactionAmount();
		int turnOver = monthly * ((1 + 10 / 1200) ^ month);
		poli.setTotalAmountCalculated(turnOver);
		int deduction = 0;
		int returnAmount = 0;
		
		if(poli.getTotalAmountCalculated()>=0 && poli.getTotalAmountCalculated()<=500000)
		{
			 deduction=0;
			 returnAmount=(turnOver-deduction);
//		poli.setIncomeTaxDeduction(0);
		//poli.setTotalAmountReturn(turnOver);
		}
		else if(poli.getTotalAmountCalculated()>=500000 && poli.getTotalAmountCalculated()<=100000)
		{
			 deduction=((turnOver*20)/100);
			 returnAmount=(turnOver-deduction);
			
		}
		else if(poli.getTotalAmountCalculated()>=1000000 && poli.getTotalAmountCalculated()<=200000)
		{
			 deduction=((turnOver*30)/100);
			 returnAmount=(turnOver-deduction);
			
		}
		poli.setIncomeTaxDeduction(deduction);
		poli.setTotalAmountReturn(returnAmount);
		
		return poli;
	}
//	public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
//	    return dateToConvert.toInstant()
//	      .atZone(ZoneId.systemDefault())
//	      .toLocalDate();
//	}

}
