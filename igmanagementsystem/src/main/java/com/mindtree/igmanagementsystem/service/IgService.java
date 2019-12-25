package com.mindtree.igmanagementsystem.service;

import java.util.List;

import com.mindtree.igmanagementsystem.dto.AccountDto;
import com.mindtree.igmanagementsystem.entity.Account;
import com.mindtree.igmanagementsystem.entity.Ig;
import com.mindtree.igmanagementsystem.exception.IgManagementControllerException;

public interface IgService {

	String addIg(Ig ig);

	String addAccountToIg(int igId, int accountId) throws IgManagementControllerException;

	List<AccountDto> getAccountsByIg(int igId) throws IgManagementControllerException;

}
