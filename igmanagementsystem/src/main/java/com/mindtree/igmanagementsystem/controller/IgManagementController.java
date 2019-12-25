package com.mindtree.igmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.igmanagementsystem.dto.AccountDto;
import com.mindtree.igmanagementsystem.entity.Account;
import com.mindtree.igmanagementsystem.entity.Ig;
import com.mindtree.igmanagementsystem.exception.IgManagementControllerException;
import com.mindtree.igmanagementsystem.service.AccountService;
import com.mindtree.igmanagementsystem.service.IgService;
import com.mindtree.igmanagementsystem.service.ProjectService;

@RestController
public class IgManagementController {
	@Autowired
	IgService igService;
	@Autowired
	AccountService accountService;
	@Autowired
	ProjectService projectService;

	@PostMapping("/addIg")
	public String addIg(@RequestBody Ig ig) {
		return igService.addIg(ig);
	}

	@PostMapping("/addAcount")
	public String addAccount(@RequestBody Account account) throws IgManagementControllerException {
		return accountService.addAccount(account);
	}

	@PostMapping("/addAccountToIg/{igId}/{accountId}")
	public String addAccountToIg(@PathVariable int igId, @PathVariable int accountId)
			throws IgManagementControllerException {
		return igService.addAccountToIg(igId, accountId);
	}

	@GetMapping("getAccountsByIg/{igId}")
	public List<AccountDto> getAccountsByIg(@PathVariable int igId) throws IgManagementControllerException {
		return igService.getAccountsByIg(igId);
	}
}
