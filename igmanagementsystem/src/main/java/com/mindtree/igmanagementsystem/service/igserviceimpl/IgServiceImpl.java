package com.mindtree.igmanagementsystem.service.igserviceimpl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.igmanagementsystem.dto.AccountDto;
import com.mindtree.igmanagementsystem.entity.Account;
import com.mindtree.igmanagementsystem.entity.Ig;
import com.mindtree.igmanagementsystem.exception.IgManagementControllerException;
import com.mindtree.igmanagementsystem.exception.IgNotFoundException;
import com.mindtree.igmanagementsystem.exception.NoIgFoundException;
import com.mindtree.igmanagementsystem.exception.NoSuchAccountPresentException;
import com.mindtree.igmanagementsystem.repository.AccountRepository;
import com.mindtree.igmanagementsystem.repository.IgRepository;
import com.mindtree.igmanagementsystem.repository.ProjectRepository;
import com.mindtree.igmanagementsystem.service.IgService;

@Service
public class IgServiceImpl implements IgService {
	@Autowired
	IgRepository igRepo;
	@Autowired
	AccountRepository accountRepo;
	@Autowired
	ProjectRepository projectRepo;
	ModelMapper modelMapper = new ModelMapper();

	@Override
	public String addIg(Ig ig) {
		// TODO Auto-generated method stub
		igRepo.save(ig);
		return "success";
	}

	@Override
	public String addAccountToIg(int igId, int accountId) throws IgManagementControllerException {
		// TODO Auto-generated method stub
		List<Ig> igs = igRepo.findAll();
		Ig ig = igs.stream().filter(i -> i.getIgId() == igId).findAny()
				.orElseThrow(() -> new NoIgFoundException("No Ig Found"));
		List<Account> accounts = accountRepo.findAll();
		Account account = accounts.stream().filter(i -> i.getAccountId() == accountId).findAny()
				.orElseThrow(() -> new NoSuchAccountPresentException("Account not present"));
		// account.setIg(ig);
		ig.getAccounts().add(account);
		accountRepo.saveAndFlush(account);
		return "success";
	}

	@Override
	public List<AccountDto> getAccountsByIg(int igId) throws IgManagementControllerException {
		// TODO Auto-generated method stub
		List<Ig> igs = igRepo.findAll();
		Ig ig = igs.stream().filter(i -> i.getIgId() == igId).findAny()
				.orElseThrow(() -> new IgNotFoundException("Ig not Found"));
		List<Account> accounts = ig.getAccounts();
		List<AccountDto> accountDtos = accounts.stream().map(i -> convertEntityToDto(i)).collect(Collectors.toList());
		Collections.sort(accountDtos, Collections.reverseOrder());
		return accountDtos;

	}

	private AccountDto convertEntityToDto(Account i) {
		// TODO Auto-generated method stub
		return modelMapper.map(i, AccountDto.class);
	}
}