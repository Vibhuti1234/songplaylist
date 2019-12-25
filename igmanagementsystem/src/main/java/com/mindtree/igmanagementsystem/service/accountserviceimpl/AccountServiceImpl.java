package com.mindtree.igmanagementsystem.service.accountserviceimpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.igmanagementsystem.dto.AccountDto;
import com.mindtree.igmanagementsystem.entity.Account;
import com.mindtree.igmanagementsystem.entity.Ig;
import com.mindtree.igmanagementsystem.entity.Project;
import com.mindtree.igmanagementsystem.exception.IgManagementControllerException;
import com.mindtree.igmanagementsystem.exception.TotalProjectRevenueExceedsAcountRevenueException;
import com.mindtree.igmanagementsystem.repository.AccountRepository;
import com.mindtree.igmanagementsystem.repository.IgRepository;
import com.mindtree.igmanagementsystem.repository.ProjectRepository;
import com.mindtree.igmanagementsystem.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService{
	@Autowired 
	IgRepository igRepo;
	@Autowired
	AccountRepository accountRepo;
	@Autowired
	ProjectRepository projectRepo;
	ModelMapper modelMapper=new ModelMapper();
	@Override
	public String addAccount(Account account) throws IgManagementControllerException {
		// TODO Auto-generated method stub
	
		double sum=0;
		List<Project> projects=account.getProjects();
		//Ig ig=account.getIg();
		//projects.stream().forEach(i->{i.setAccount(account);});
		
		for (Project project : projects) {
			sum=sum+project.getProjectCost();
		}
		if(account.getRevenue()<sum)	
		{
			throw new TotalProjectRevenueExceedsAcountRevenueException("Not Possible bro");
		}
		//igRepo.save(ig);
		
		accountRepo.save(account);
		//projects.stream().forEach(i->{projectRepo.save(i);});
		//accountRepo.save(account);

		return "success";
			 	
	}
	private Account convertDtoToEntity(AccountDto account) {
		// TODO Auto-generated method stub
		return modelMapper.map(account,Account.class);
	}

}
