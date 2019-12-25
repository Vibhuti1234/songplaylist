package com.mindtree.igmanagementsystem.service;

import com.mindtree.igmanagementsystem.dto.AccountDto;
import com.mindtree.igmanagementsystem.entity.Account;
import com.mindtree.igmanagementsystem.exception.IgManagementControllerException;

public interface AccountService {

	String addAccount(Account account) throws IgManagementControllerException;

}
