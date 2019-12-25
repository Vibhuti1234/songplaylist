package com.mindtree.igmanagementsystem.service.projectserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.igmanagementsystem.repository.AccountRepository;
import com.mindtree.igmanagementsystem.repository.IgRepository;
import com.mindtree.igmanagementsystem.repository.ProjectRepository;
import com.mindtree.igmanagementsystem.service.ProjectService;
@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired 
	IgRepository igRepo;
	@Autowired
	AccountRepository accountRepo;
	@Autowired
	ProjectRepository projectRepo;

}
