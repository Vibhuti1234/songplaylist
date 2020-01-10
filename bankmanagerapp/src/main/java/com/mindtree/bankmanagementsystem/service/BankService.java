package com.mindtree.bankmanagementsystem.service;

import com.mindtree.bankmanagementsystem.entity.Bank;
import com.mindtree.bankmanagementsystem.exception.ControllerServiceException;

public interface BankService {

	void addBank(Bank bank) throws ControllerServiceException;

	Object getBanks();

	void linkBankAndUser(int bankId, int userId) throws ControllerServiceException;

}
