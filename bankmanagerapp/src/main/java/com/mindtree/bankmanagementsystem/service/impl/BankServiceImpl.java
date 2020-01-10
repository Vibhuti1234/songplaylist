package com.mindtree.bankmanagementsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bankmanagementsystem.entity.Bank;
import com.mindtree.bankmanagementsystem.entity.User;
import com.mindtree.bankmanagementsystem.exception.BankCheckerException;
import com.mindtree.bankmanagementsystem.exception.ControllerServiceException;
import com.mindtree.bankmanagementsystem.repository.BankRepository;
import com.mindtree.bankmanagementsystem.repository.UserRepository;
import com.mindtree.bankmanagementsystem.service.BankService;
@Service
public class BankServiceImpl implements BankService{
	@Autowired
	BankRepository bankRepository;
	@Autowired
	UserRepository userRepository;

	@Override
	public void addBank(Bank bank) throws ControllerServiceException {
		List<Bank> banks = bankRepository.findAll();
		//Bank bankResult=bankRepository.findAll().stream().filter(i->i.getBankName().equalsIgnoreCase(bank.getBankName())).findAny().orElseThrow(()->new NoSuchBankFoundException("No Such Bank Found"));
		int count=0;
		for (Bank bank2 : banks) {
			if(bank2.getBankName().compareToIgnoreCase(bank.getBankName())==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			bankRepository.save(bank);
		}
		else
		{
			throw new BankCheckerException("bank Already Exists");
		}
		
	}

	@Override
	public Object getBanks() {
		
		return bankRepository.findAll();
	}

	@Override
	public void linkBankAndUser(int bankId, int userId) throws ControllerServiceException {
		Bank bank=bankRepository.getOne(bankId);
		User user=userRepository.getOne(userId);
		int count=0;
		for (User u : bank.getUsers()) {
			if(u.getUserId()==user.getUserId()) {
				count++;
			}
		}
		if(count!=0)
		{
			throw new BankCheckerException("Sorry! this user is already added");
		}
		else
		{
		double balance=bank.getBankBalance()+user.getOpeningBalance();
		bank.setBankBalance(balance);
		bank.getUsers().add(user);
		bankRepository.saveAndFlush(bank);
		}
	}
	


}
