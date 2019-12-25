package com.mindtree.insurancepolicy.service;

import java.util.List;


import com.mindtree.insurancepolicy.dto.CustomerDto;
import com.mindtree.insurancepolicy.dto.CustomerTransactionDto;
import com.mindtree.insurancepolicy.dto.PolicyDetailsDto;
import com.mindtree.insurancepolicy.entiy.Customer;
import com.mindtree.insurancepolicy.entiy.Transaction;
import com.mindtree.insurancepolicy.exception.ServiceException;

public interface InsurancePolicyService {

	Customer addCustomers(CustomerDto customers, int policyId) throws ServiceException;

	CustomerTransactionDto getAllTransactions(int customerId);

	PolicyDetailsDto getAllDetails(int customerId, int transactionId);

}
